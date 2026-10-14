class Solution {
    public void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            temp.add(candidates[i]);
            backtrack(ans, temp, candidates, target - candidates[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
}