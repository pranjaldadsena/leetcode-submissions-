class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int result = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            int rem = (sum % k + k) % k;
            result += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return result;
    }
}