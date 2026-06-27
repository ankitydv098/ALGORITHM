class Solution {
    public boolean pallindromehelper(int i,int j, String s){
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {

        int i=0,
            j=s.length()-1;

        while(i<j){
            char left=s.charAt(i),
                 right=s.charAt(j);

            if(left != right){
                return pallindromehelper(i+1,j,s) || pallindromehelper(i,j-1,s);

            } else{
                i++;
                j--;
            }
        }

        return true;

        
    }
}