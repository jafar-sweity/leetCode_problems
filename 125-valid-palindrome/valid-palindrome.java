class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");


        for (int i=0; i<s.length();i++)
        {
            if  (s.charAt(i) != s.charAt(s.length()-1-i))
            return false; 
        }
        return true;
    }
}