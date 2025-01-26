import java.util.*;

class Solution {
    public int maximumInvitations(int[] favorite) {
        int N = favorite.length;  // Number of people (nodes)
        Map<Integer, List<Integer>> graph = new HashMap<>();  // Graph to store invitations (edges)
        int singleMaxCycleSize = 0;  // The maximum cycle size found
        List<int[]> pairs = new ArrayList<>();  // Stores the two-person chains (2-cycles)
        Map<Integer, Integer> maxInvites = new HashMap<>();  // Maximum invitation count for each person

        // Build the graph where each person invites another person
        for (int i = 0; i < N; i++) {
            int pre = favorite[i];  // The person who is invited
            int cur = i;  // The person doing the inviting
            graph.putIfAbsent(pre, new ArrayList<>());
            graph.get(pre).add(cur);  // Add an edge from pre to cur
        }

        // Detect cycles and calculate the maximum invitations
        countCycle(graph, N, favorite, singleMaxCycleSize, pairs);
        
        // Return the maximum of the largest cycle size and the size of two-person chains
        return Math.max(singleMaxCycleSize, countSizeTwoExtra(graph, N, pairs, maxInvites));
    }

    // This function calculates the invitations from two-person chains
    private int countSizeTwoExtra(Map<Integer, List<Integer>> graph, int N, List<int[]> pairs, Map<Integer, Integer> maxInvites) {
        boolean[] visited = new boolean[N];  // To keep track of visited nodes
        int result = 0;  // To accumulate the result of maximum invitations

        // Iterate through the pairs of two-person chains
        for (int[] pair : pairs) {
            int a = pair[0];
            int b = pair[1];
            maxInvites.put(a, 0);  // Reset the max invitation count for person a
            maxInvites.put(b, 0);  // Reset the max invitation count for person b

            // Start DFS from person a and b to find the maximum chain length
            visited[a] = true;
            dfs(b, visited, 0, b, graph, maxInvites);
            visited[a] = false;

            visited[b] = true;
            dfs(a, visited, 0, a, graph, maxInvites);
            visited[b] = false;

            // Compare the lengths of the chains and take the larger one
            if (maxInvites.get(a) > 0 && maxInvites.get(b) > 0) {
                result += (maxInvites.get(a) + maxInvites.get(b));  // Add both if both are valid
            } else {
                result += Math.max(maxInvites.get(a), maxInvites.get(b));  // Add the larger one
            }

            // Add 2 for the two-person chain
            result += 2;
        }

        return result;
    }

    // DFS function to calculate the chain length for each person
    private void dfs(int cur, boolean[] visited, int length, int start, Map<Integer, List<Integer>> graph, Map<Integer, Integer> maxInvites) {
        if (visited[cur]) return;

        // Update the max invitation length for the start person
        maxInvites.put(start, Math.max(maxInvites.get(start), length));
        visited[cur] = true;

        // Explore all the people that the current person is inviting
        for (int nei : graph.get(cur)) {
            if (!visited[nei]) {
                dfs(nei, visited, length + 1, start, graph, maxInvites);
            }
        }
        visited[cur] = false;  // Backtrack and unmark the current person
    }

    // This function detects cycles in the graph and calculates the largest cycle size
    private void countCycle(Map<Integer, List<Integer>> graph, int N, int[] favorite, int singleMaxCycleSize, List<int[]> pairs) {
        boolean[] visited = new boolean[N];  // Visited array to track nodes
        boolean[] recStack = new boolean[N];  // Recursion stack for cycle detection

        // Iterate through each person to detect cycles
        for (int i = 0; i < N; i++) {
            isCyclicUtil(i, visited, recStack, 0, graph, favorite, singleMaxCycleSize, pairs);
        }
    }

    // This helper function is used to detect cycles using DFS
    private void isCyclicUtil(int i, boolean[] visited, boolean[] recStack, int count, Map<Integer, List<Integer>> graph, int[] favorite, int singleMaxCycleSize, List<int[]> pairs) {
        if (recStack[i]) {
            singleMaxCycleSize = Math.max(singleMaxCycleSize, count);  // Update the largest cycle size
            if (count == 2) pairs.add(new int[] {i, favorite[i]});  // Handle 2-person chains
            return;
        }

        if (visited[i]) return;

        visited[i] = true;  // Mark the node as visited
        recStack[i] = true;  // Mark the node as part of the recursion stack

        // Recurse for all neighbors (people invited by the current person)
        for (int c : graph.get(i)) {
            isCyclicUtil(c, visited, recStack, count + 1, graph, favorite, singleMaxCycleSize, pairs);
        }
        recStack[i] = false;  // Remove the node from the recursion stack
    }
}