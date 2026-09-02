class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]) - 1;
            if (nums[n] < 0) {
                result.add(n + 1);
            } else {
                nums[n] = -nums[n];
            }
        }
        
        return result;
    }
}