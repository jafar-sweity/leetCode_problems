class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> mymap = new HashMap<Integer , Integer> ();
        int x =0;
        for (int i =0;i<nums.length ;i++)
        {
            x  = x ^ nums[i];
        }
         

        return x;

    }
}