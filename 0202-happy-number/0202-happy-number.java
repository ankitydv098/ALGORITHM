// import java.util.HashSet;

class Solution {
    // --> sum of square of digits 
    public int sumofsquareofdigit(int n){
        int sum =0;
        while(n>0){
            int dig = n%10;
            sum = sum + (dig*dig);
            n=n/10;
        }
        return sum;


    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast!=1){
            slow =sumofsquareofdigit(slow);
            fast=sumofsquareofdigit(sumofsquareofdigit(fast));
            if(fast==1){
                return true;
            }
            if(slow==fast){
                return false;
            }
         
        }
           return true;
    }
}

    //     HashSet<Integer> set = new HashSet<>();

    //     while (n != 1 && !set.contains(n)) {
    //         set.add(n);
    //         n = squareSum(n);
    //     }

    //     return n == 1;
    // }

    // public int squareSum(int n) {

    //     int sum = 0;

    //     while (n > 0) {
    //         int digit = n % 10;
    //         sum += digit * digit;
    //         n /= 10;
    //     }

    //     return sum;
    
