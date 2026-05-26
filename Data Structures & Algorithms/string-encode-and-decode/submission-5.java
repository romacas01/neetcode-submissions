class Solution {

  public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimiter));
            decoded.add(str.substring(delimiter + 1, delimiter + 1 + length));
            i = delimiter + 1 + length;
        }

        return decoded;
    }
}