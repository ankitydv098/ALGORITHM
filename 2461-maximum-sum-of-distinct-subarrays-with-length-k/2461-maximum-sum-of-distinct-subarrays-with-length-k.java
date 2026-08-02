class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long ans = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                sum -= nums[left];

                int freq = map.get(nums[left]) - 1;
                if (freq == 0)
                    map.remove(nums[left]);
                else
                    map.put(nums[left], freq);

                left++;
            }

            if (right - left + 1 == k && map.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}