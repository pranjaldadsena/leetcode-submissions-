class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right =clean.length() - 1;
        while(left<right){
            char l=clean.charAt(left);
            char r=clean.charAt(right);
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
              return false;
            }
            left++;
            right--;
        }
    return true;
    }
}