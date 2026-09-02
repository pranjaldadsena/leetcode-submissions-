 import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int n = horizontalCuts.length;
        int m = verticalCuts.length;
        int[] golu = new int[n + 2];
        int[] molu = new int[m + 2];
        for (int i = 0; i < n; i++) {
            golu[i] = horizontalCuts[i];
        }
        for (int i = 0; i < m; i++) {
            molu[i] = verticalCuts[i];
        }
        golu[n] = 0;
        golu[n + 1] = h;
        molu[m] = 0;
        molu[m + 1] = w;
        Arrays.sort(golu);
        Arrays.sort(molu);
        long hc = 0;
        long vc = 0;
        for (int i = 0; i < golu.length - 1; i++) {
            hc = Math.max(hc, golu[i + 1] - golu[i]);
        }
        for (int i = 0; i < molu.length - 1; i++) {
            vc = Math.max(vc, molu[i + 1] - molu[i]);
        }
        return (int) ((hc * vc) % 1_000_000_007);
    }
}