class Solution {
public:
    void moveZeroes(vector<int>& a) {
    int j=0,i=1;
    int n = a.size();
    if(n==0 || n==1) return;
    while(i<n){
        if(a[j]==0){
            if(a[i]!=0){
                swap(a[i],a[j]);
                i++;
                j++;
            }else{
                i++;
            }
        }else{
            i++;
            j++;
        }
    }
        
    }
};