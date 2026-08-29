class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        int ans = 0;
        for(int x : time){
            int rem = x % 60;
            int need = (60-rem) % 60;
            ans += count[need];
            count[rem]++;
        }
        return ans;
    }
}