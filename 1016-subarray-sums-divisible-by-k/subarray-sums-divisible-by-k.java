class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] ps = new int[k];
        ps[0] = 1;
        int s = 0;
        int c = 0;
        for (int i : nums) {
            s += i;
            int r = s % k;
            if (r < 0)
                r += k;
            c += ps[r];
            ps[r]++;
        }
        return c;
    }
}