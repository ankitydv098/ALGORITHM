class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {   // manual comparison
                    maxCount = count;
                }
            } else {
                count = 0; // reset streak
            }
        }

        return maxCount;
    }
}
