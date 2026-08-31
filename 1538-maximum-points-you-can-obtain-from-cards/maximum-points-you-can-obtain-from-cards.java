class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int currentSum = 0;
        
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }
        
        int maxScore = currentSum;
        int n = cardPoints.length;
        
        int left = k - 1;
        int right = n - 1;
        
        while (left >= 0) {
            currentSum += cardPoints[right--] - cardPoints[left--];
            if (currentSum > maxScore) {
                maxScore = currentSum;
            }
        }
        
        return maxScore;
    }
}