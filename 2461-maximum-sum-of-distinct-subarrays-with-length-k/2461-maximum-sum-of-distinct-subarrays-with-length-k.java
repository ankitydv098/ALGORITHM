// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         long sum = 0;
//         long ans = 0;
//         int left = 0;

//         for (int right = 0; right < nums.length; right++) {

//             sum += nums[right];
//             map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

//             if (right - left + 1 > k) {
//                 sum -= nums[left];

//                 int freq = map.get(nums[left]) - 1;
//                 if (freq == 0)
//                     map.remove(nums[left]);
//                 else
//                     map.put(nums[left], freq);

//                 left++;
//             }

//             if (right - left + 1 == k && map.size() == k) {
//                 ans = Math.max(ans, sum);
//             }
//         }

//         return ans;
//     }
// }

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;

        int maxValue = 0;
        for (int x : nums)
            maxValue = Math.max(maxValue, x);

        int[] freq = new int[maxValue + 1];

        long sum = 0;
        long maxSum = 0;
        int distinct = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];

            if (freq[nums[i]] == 0)
                distinct++;

            freq[nums[i]]++;
        }

        if (distinct == k)
            maxSum = sum;

        // Sliding window
        for (int i = k; i < n; i++) {

            int left = nums[i - k];
            freq[left]--;
            sum -= left;

            if (freq[left] == 0)
                distinct--;

            int right = nums[i];

            if (freq[right] == 0)
                distinct++;

            freq[right]++;
            sum += right;

            if (distinct == k)
                maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}