class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        
        if (n < 4) return result;
        
        for (int i = 0; i < n - 3; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            
           
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                
                
                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) continue;
                
                int l = j + 1;
                int r = n - 1;
                
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return result;
    }
}