class Solution {
public:
    void rotate(vector<int>& arr, int k) {
        int n = arr.size();
        reverse(arr.begin(),arr.begin() + k);
        reverse(arr.begin() + k,arr.begin() + arr.end());
        reverse(arr.begin() ,arr.begin() + arr.end());
    }
};