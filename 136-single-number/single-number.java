class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> mymap = new HashMap<Integer , Integer> ();
        int x =0;
        for (int i =0;i<nums.length ;i++)
        {
            mymap.put(nums[i],mymap.getOrDefault(nums[i],0)+1);
        }
         for (int i =0;i<nums.length ;i++)
        {
           if (mymap.get(nums[i])==1)
           {
             x= nums[i];
           }
          
        }

        return x;

    }
}