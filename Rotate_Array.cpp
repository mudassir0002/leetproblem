#include <vector>
#include <algorithm> // for std::reverse

class Solution {
public:
    void rotate(vector<int>& arr, int k) {
        int n = arr.size();
        k = k % n; // to handle cases where k > n
        if (k == 0) return; // no rotation needed if k is 0
        
     
        reverse(arr.begin(), arr.end());
        // Step 2: Reverse the first k elements
        reverse(arr.begin(), arr.begin() + k);
        // Step 3: Reverse the remaining n - k elements
        reverse(arr.begin() + k, arr.end());
    }
};
