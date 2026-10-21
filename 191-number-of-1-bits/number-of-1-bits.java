class Solution {
    public int div(int n){
        if(n==0){
          
            return 0;
        }
        
        return(n%2!=0?1:0)+div(n/2);
    }
    public int hammingWeight(int n) {
        return div(n);
        
    }
}