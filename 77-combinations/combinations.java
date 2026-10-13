class Solution {
    public void backtrack(List<List<Integer>> result, int n, int k, List<Integer> temp, int start) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            temp.add(i);
            backtrack(result, n, k, temp, i + 1);
            temp.remove(temp.size() - 1);
        }   
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(result, n, k, temp, 1);
        return result;
    }
}