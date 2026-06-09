class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String st : strs) {
            char[] stArr = st.toCharArray();

            Arrays.sort(stArr);

            String sortedStr = new String(stArr);

            groups.computeIfAbsent(sortedStr, (s) -> new ArrayList<>());
            groups.get(sortedStr).add(st);
        }


        return new ArrayList<>(groups.values());
    }
}