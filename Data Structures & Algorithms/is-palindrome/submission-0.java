class Solution {
    public boolean isPalindrome(String s) {
        String replaced = s.replaceAll("[^A-Za-z0-9]", "");
        String replacedLower = replaced.toLowerCase();

        for (int i = 0; i < replaced.length(); i++) {
            if (replacedLower.charAt(i) != replacedLower.charAt(replacedLower.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }
}
