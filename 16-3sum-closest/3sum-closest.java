class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
      int c = nums[0] + nums[1] + nums[2];
      int n=nums.length;
      int nc;
      for(int i=0;i<n-2;i++){
        int l=i+1;
        int r=n-1;
        while(l<r){
            nc=nums[i]+nums[l]+nums[r];
            if(Math.abs(target-nc)<=Math.abs(target-c)){
                c=nc;
            }
            if (nc < target) {
                    l++;
                } else if (nc > target) {
                    r--;
                } else {
                    return nc; 
                }


        }
      }
      
    return c;   
    }
}