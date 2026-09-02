class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count =0;
        for(int i:map.keySet()){
            if (k>0){
                if(map.containsKey(k+i)){

                count++;
                }
            }
            else if(k==0){
                 if(map.get(i)>=2){
                    count++;
                 }
            }
        }
    return count;   
    }
}