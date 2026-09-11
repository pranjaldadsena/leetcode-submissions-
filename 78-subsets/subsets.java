class Solution {
    public void help(List<List<Integer>>ans , List<Integer> temp,int[]nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        help(ans,temp,nums,i+1);
        temp.remove(temp.size() - 1);
        help(ans,temp,nums,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        help(ans,temp,nums,0);
        return ans;
    }
}