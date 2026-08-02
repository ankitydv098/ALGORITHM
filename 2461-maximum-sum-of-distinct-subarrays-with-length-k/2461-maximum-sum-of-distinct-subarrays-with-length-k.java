class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0,j=0;
        long res = 0;
        long sum = 0;

        while(j<nums.length) {
           map.put(nums[j],map.getOrDefault(nums[j],0) + 1);
           sum += nums[j];

           if(j-i+1 > k) {
                sum -= nums[i];
                map.put(nums[i],map.get(nums[i]) - 1);

                if(map.get(nums[i])  == 0) {
                    map.remove(nums[i]);
                }
                i++;
           }

           if(j-i+1 == k && map.size() == k) {
            res = Math.max(res,sum);
           }
           
           j++;
        }
        return res;
    }
}