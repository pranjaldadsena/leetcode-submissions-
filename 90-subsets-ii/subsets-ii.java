class Solution {
    public void backtrack(List<List<Integer>> result,int[]nums,List<Integer>temp,int start){
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start&&nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            backtrack(result, nums, temp, i + 1);
            temp.remove(temp.size() - 1); 
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,nums,temp,0);
        return result;
        
    }
}