class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new int[k], 1, n, k, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] temp, int start, int n, int k, int depth) {
        if (depth == k) {
            List<Integer> list = new ArrayList<>(k);
            for (int val : temp) {
                list.add(val);
            }
            result.add(list);
            return;
        }

        int need = k - depth;
        for (int i = start; i <= n - need + 1; i++) {
            temp[depth] = i;
            backtrack(result, temp, i + 1, n, k, depth + 1);
        }
    }
}