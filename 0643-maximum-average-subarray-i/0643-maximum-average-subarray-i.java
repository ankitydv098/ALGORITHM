class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE,sum= 0.0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum = (sum+nums[j]);


            if(j-i+1 > k) {
                sum -= nums[i];
                i++;
            }

            if(j-i+1 == k) {
                max = Math.max(max,(sum/k));
            }
        }
        
        return max;
    }
}