class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
            
        }
     
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();   
        String reversed = new StringBuilder(cleaned).reverse().toString();   
       
        return cleaned.equals(reversed);
        
        
    }
}