class Solution {
    public int maxArea(int[] height) {
      int l=height[0];
      int n=height.length;
      int r=height[n-1];
      int max=0;
      int j=n-1;
      int i=0;
      while(i<j){
        int min=Math.min(l,r);
        int area=min*(j-i);
        if(l<r){
            i++;
            l=height[i];
        }else{
            j--;
            r=height[j];
        }
        max=Math.max(max,area);

      } 
      
    return max;
    }
}