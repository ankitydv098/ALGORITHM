class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            String numstr = String.valueOf(num);  
            if(numstr.length()%2==0){
                count++;
            }
        } 
        
        return count;
    }
}