class Solution {
    public int maxSubArray(int[] nums) {
        int msf = nums[0];
        int cm = nums[0];
        for(int i=1;i<nums.length;i++){
            cm=Math.max(nums[i],cm+nums[i]);
            msf=Math.max(cm,msf);
            
        }

        

        return msf;
    }
}