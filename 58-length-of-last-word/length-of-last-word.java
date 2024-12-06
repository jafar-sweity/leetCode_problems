class Solution {
    public int lengthOfLastWord(String s) {
        int e=s.length()-1;

        while(e>=0 && s.charAt(e)==' ')
        e--;

        int st=e;

        while(st>=0 && s.charAt(st)!=' ')
        st--; 
        
        return e-st;
    }
}