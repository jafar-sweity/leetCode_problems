class Solution {
    public int lengthOfLongestSubstring(String s) {
 HashMap<Character,Integer> count=new HashMap<Character,Integer>();
 ArrayList<Integer> c = new  ArrayList<Integer> ();
 int start =0;
 int n=0;
    s.replace(" ","");
    if(s.length()==0 || s==null)
    return 0;
    for (int i=0;i<s.length();i++)
    {
        char currentChar = s.charAt(i);
    if (count.containsKey(currentChar) && count.get(currentChar) >=start) {
                c.add(n); 
                start = count.get(currentChar) + 1;
                n = i - start + 1; 
            } 
            else {

                n++;
            }
         count.put(currentChar, i);

    }
        c.add(n);
        Collections.sort(c);
        return c.get(c.size()-1);

    }
}