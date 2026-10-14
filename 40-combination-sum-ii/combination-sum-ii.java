class Solution {
    public void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int start, int sum) {
        if (target == sum) {
            ans.add(new ArrayList<>(temp));
            return;
        } 
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (sum + candidates[i] > target) break;
            temp.add(candidates[i]);
            backtrack(ans, temp, candidates, target, i + 1, sum + candidates[i]);
            temp.remove(temp.size() - 1); 
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        backtrack(ans, new ArrayList<>(), candidates, target, 0, 0);
        return ans;
    }
}