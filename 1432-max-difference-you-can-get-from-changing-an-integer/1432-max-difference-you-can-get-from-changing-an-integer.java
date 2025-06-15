class Solution 
{
    public int maxDiff(int num) 
    {
        // Step 1: Convert the number to a string
        String numStr = String.valueOf(num);

        // Step 2: Get the max version of the number
        int maxVersion = getMaxVersion(numStr);

        // Step 3: Get the min version of the number
        int minVersion = getMinVersion(numStr);

        // Step 4: Return the absolute difference
        return maxVersion - minVersion;
    }

    // Helper to get maximum value by replacing digits
    public int getMaxVersion(String numStr) 
    {
        // Step 3.1: Find the first digit that is NOT 9
        char target = 0;
        for (char c : numStr.toCharArray()) 
        {
            if (c != '9') 
            {
                target = c;
                break;
            }
        }

        // Step 3.2: If all digits are 9, return original number
        if (target == 0)
        {
            return Integer.parseInt(numStr);
        } 

        // Step 3.3: Replace all occurrences of that digit with '9'
        StringBuilder maxStr = new StringBuilder();
        for (char c : numStr.toCharArray()) 
        {
            if (c == target) 
            {
                maxStr.append('9');
            }
            else 
            {
                maxStr.append(c);
            }
        }

        // Step 3.4: Convert and return the integer
        return Integer.parseInt(maxStr.toString());
    }

    // Helper to get minimum value by replacing digits
    private int getMinVersion(String numStr) 
    {
        char firstChar = numStr.charAt(0);
        char target = 0;
        char replaceWith = 0;

        // Step 4.1: If the first digit is not '1', replace it with '1'
        if (firstChar != '1') 
        {
            target = firstChar;
            replaceWith = '1';
        } 
        else 
        {
            // Step 4.2: Else find first non-0 or non-1 digit and replace with '0'
            for (int i = 1; i < numStr.length(); i++) 
            {
                char c = numStr.charAt(i);
                if (c != '0' && c != '1') 
                {
                    target = c;
                    replaceWith = '0';
                    break;
                }
            }

            // Step 4.3: If no such digit found, return original number
            if (target == 0)
            {
                return Integer.parseInt(numStr);
            } 
        }

        // Step 4.4: Replace all occurrences of the target with new value
        StringBuilder minStr = new StringBuilder();
        for (char c : numStr.toCharArray()) 
        {
            if (c == target) 
            {
                minStr.append(replaceWith);
            } 
            else 
            {
                minStr.append(c);
            }
        }

        // Step 4.5: Convert and return the integer
        return Integer.parseInt(minStr.toString());
    }
}