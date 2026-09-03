class Solution {
    
    public void help(int i, int[] nums, List<Integer> temp,List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        help(i + 1, nums, temp,ans);
        temp.remove(temp.size() - 1);
        help(i + 1, nums, temp,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        help(0, nums, temp,ans);
        return ans;
    }
}