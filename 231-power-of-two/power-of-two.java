class Solution {
    public boolean isPowerOfTwo(int n) {

        for (int i =0 ; i <=50 ; i++)
        {
            if (Math.pow(2,i)==n)
            return true;
        }

        return false ;
    }
}