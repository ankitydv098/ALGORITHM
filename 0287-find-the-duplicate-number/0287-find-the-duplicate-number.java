class Solution {
    
     public int  findDuplicate(int[] nums){

        int slow = 0;
        int fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];

            if(slow==fast){
                break;
            }

        } while(slow != fast);

        int n1=0,
            n2=slow;

        while(n1 != n2){
            n1=nums[n1];
            n2=nums[n2];
        }
    return n1;







    //     int i = 0;

    //     while (i< arr.length){

    //         if(arr[i] != i + 1){
    //             int correct = arr[i] - 1;
    //             if (arr[i] != arr[correct] ) {
    //                 swap( arr, i , correct);
    //             }
    //             else {
    //                return arr[i];
    //             }

    //         }
    //         else{
    //             i++;
    //         }


    //     }
    //     return -1;
    // }


    // static void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;



    }

}