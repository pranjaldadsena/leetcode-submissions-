class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordDict.size(); i++) {
            map.put(wordDict.get(i), 300);
        }
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if (dp[j] && map.containsKey(s.substring(j, i))) {
            dp[i] = true;
            break; 
        }
        }
        }
    return dp[s.length()];   
    }
}