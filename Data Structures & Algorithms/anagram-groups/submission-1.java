class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        List<String> visited = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> wordAnagrams = new ArrayList<>();
            wordAnagrams.add(strs[i]);

            if (visited.contains(strs[i])) {
                continue;
            }
            visited.add(strs[i]);

            for (int j = i+1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    wordAnagrams.add(strs[j]);
                    visited.add(strs[j]);
                }
            }
            result.add(wordAnagrams);
        }

        return result;
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}