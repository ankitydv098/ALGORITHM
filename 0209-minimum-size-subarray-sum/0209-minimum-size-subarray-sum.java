class Solution {
    public int minSubArrayLen(int target, int[] arr) {

        int i = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];

            while (sum >= target) {

                min = Math.min(min, j - i + 1);

                sum -= arr[i];
                i++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}