class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            if (a >= 'A' && a <= 'Z') a = (char)(a + 32);
            if (b >= 'A' && b <= 'Z') b = (char)(b + 32);

            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                left++;
                continue;
            }
            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                right--;
                continue;
            }

            if (a != b) return false;

            left++;
            right--;
        }

        return true;
    }
}