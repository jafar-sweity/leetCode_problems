class Solution {
    public boolean isValid(String s) {

        Stack <Character> st=new Stack<>();
        
        for (int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='('|| a=='[' || a=='{')
            {
                st.push(a);
            }
            else {
                if(!st.isEmpty())
                {
                    char x=st.pop();
                     if(x=='(' && a!=')' ||
                        x=='[' && a!=']' ||
                        x=='{' && a!='}' )
                        {
                            return false;
                        }

                }
               else return false;
            }
        }
        return st.isEmpty();
    }
}