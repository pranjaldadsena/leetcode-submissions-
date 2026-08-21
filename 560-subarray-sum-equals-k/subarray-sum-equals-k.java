class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int n = nums.length;
        int count = 0;
        int[] prefixSum = new int[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++)
        {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        Map<Integer, Integer> m = new HashMap<>(); 

        for (int j = 0; j < n; j++)
        {
            if (prefixSum[j] == k) count++;

            int val = prefixSum[j] - k;
            if (m.containsKey(val))
            {
                count += m.get(val);
            }

            if (!m.containsKey(prefixSum[j]))
            {
                m.put(prefixSum[j], 0);
            }
            m.put(prefixSum[j], m.get(prefixSum[j]) + 1);
        }

        return count;
    }
}