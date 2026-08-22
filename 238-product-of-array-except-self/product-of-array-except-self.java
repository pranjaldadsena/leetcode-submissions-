class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int n=nums.length;
        int suf =1;
        int pre =1;
        for(int i=0;i<n;i++){
            ans[i]=pre;
          pre=pre*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*suf;
            suf=suf*nums[i];
        }
        return ans;


    }
}