class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<banned.length;i++){
        map.put(banned[i],1);
       }
       int sum=0;
       int k=0;
       for(int i=1;i<=n;i++){
        
        if(!map.containsKey(i)&&sum<=maxSum){
            sum+=i;
            k++;
        }
        if(sum>maxSum){
            sum-=i;
            k--;
            return k;
        }
       }return k; 
    }
}