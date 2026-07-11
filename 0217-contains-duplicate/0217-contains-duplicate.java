class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // if( nums==null){
        //     return false;
        // }
        // int j=nums.length-1;
        //  for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[j]){
        //         return true;
                
        //     }
        //     j--;

        //  }
        //  return false;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}