class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0; 
        int n=0;
        if (needle.length()>haystack.length())
        return -1;
        //"mississippi"
        // m i s s i
        // i s s 
        // n= 0 1 2 
        //
        
        for (int i=0; i<haystack.length();i++)
        {
            if( (haystack.charAt(i)==needle.charAt(n)) )
            {   
                n++;
                if(n==needle.length())
                return i-n+1;
                
            }
            
            else {
                
            i = i - n; 
            n=0;      
            
            }
        }
        return -1;
    }
}