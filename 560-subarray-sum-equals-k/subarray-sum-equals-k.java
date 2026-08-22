class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer, Integer> map = HashMap.newHashMap(nums.length);
      int[] pr=new int[nums.length];
      pr[0]=nums[0];
      int count=0;
      for(int i=1;i<nums.length;i++){
        pr[i]=pr[i-1]+nums[i];
      }
      for(int i=0;i<nums.length;i++){
        if(pr[i]==k)count++;
        int val=pr[i]-k;
        if(map.containsKey(val)){
         count+=map.get(val);
        }
        if(!map.containsKey(pr[i])){
         map.put(pr[i],0);
        }
    map.put(pr[i], map.get(pr[i]) + 1);
      }
      return count;
    }
}