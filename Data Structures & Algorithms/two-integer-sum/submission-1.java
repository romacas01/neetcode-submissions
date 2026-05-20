class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];
        Map<Integer, Integer> memory = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];

           if (memory.containsKey(complement)) {
                answer[0] = memory.get(complement);
                answer[1] = i;
                return answer;
           } 
           memory.put(nums[i], i);
        }
        return answer;
    }
}