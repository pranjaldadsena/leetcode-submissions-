

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int start) {
        if(start==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            result.add(temp);
        }
        for(int i=start;i<nums.length;i++){
            swap(nums,start,i);
            backtrack(result,nums,start+1);
            swap(nums,i,start);
        }
    } 
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}