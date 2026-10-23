class Solution {
public:
    int sortPermutation(vector<int>& nums) {
        int k=~0;
        for(int i=0; i<nums.size(); i++){
            if(nums[i] != i) k &=nums[i];
        }
        return max(k, 0);
    }
};