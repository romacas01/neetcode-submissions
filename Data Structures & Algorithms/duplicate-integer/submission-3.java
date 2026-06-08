class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.computeIfAbsent(num, (n) -> 0);
            count.put(num, count.get(num) + 1);

            if (count.get(num) > 1) {
                return true;
            }
        }

        return false;
    }
}