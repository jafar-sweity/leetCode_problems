class Solution {
    public boolean isValid(String s) {
     Stack<Character> st = new Stack<>();
     for(int i =0; i<s.length(); i++)
     {
        if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
        {
            st.push(s.charAt(i));
        }
        else 
        {
            if(!st.isEmpty()){
         char a=st.pop();
        
           
           
         if ((a=='('&& s.charAt(i)!=')') || (a=='['&& s.charAt(i)!=']') || (a=='{'&& s.charAt(i)!='}'))
         {   
          return false ;
        }

        }
        else return false;
     }
     
    }
        return st.isEmpty() ;

}}