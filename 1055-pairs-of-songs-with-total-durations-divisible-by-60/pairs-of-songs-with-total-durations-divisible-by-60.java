class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> remainderCounts = new HashMap<>();
        int validPairs = 0;
        
        for (int songLength : time) {
            int currentRemainder = songLength % 60;
            int neededRemainder = (currentRemainder == 0) ? 0 : 60 - currentRemainder;
            
            validPairs += remainderCounts.getOrDefault(neededRemainder, 0);
            remainderCounts.put(currentRemainder, remainderCounts.getOrDefault(currentRemainder, 0) + 1);
        }
        
        return validPairs;
       
        
        
    }      
    
}