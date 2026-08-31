class Solution {
    public int jump(int[] nums) {
      int end=0;
      int jump=0;
      int fur=0;
      for(int i=0;i<nums.length-1;i++){
        fur=Math.max(fur,i+nums[i]);
        if (i == end) {
                jump++;
                end = fur;
            }
      } 
          
    return jump;   
    }
}