class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int [] rC=new int[60];
        int vp=0;
        for(int i:time){
            int c=i%60;
            if(c==0){
                vp+=rC[0];

            }else{
                int neededR=60-c;
                vp+=rC[neededR];
            }
            rC[c]++;
        }
        return vp;
       
        
        
    }      
    
}