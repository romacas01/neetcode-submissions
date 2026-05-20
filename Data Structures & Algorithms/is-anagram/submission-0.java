class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String sRes = Arrays.toString(sArr);
        String tRes = Arrays.toString(tArr);

        return sRes.equals(tRes);
    }
}
