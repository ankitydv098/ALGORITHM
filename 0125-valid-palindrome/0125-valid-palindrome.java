class Solution {
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String n = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        int i = 0;
        int j=n.length()-1;
        while(i<j){
            if(n.charAt(i)!=n.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}