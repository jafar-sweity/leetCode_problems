class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      
        Map <Integer,Integer> mymap=new HashMap<>();
        for (int i=0;i< nums.length;i++)
        {
           int minus = target - nums[i];

           if(mymap.containsKey(minus))
           {
            int [] arr = {i,mymap.get(minus)};
            return arr;
           }
           mymap.put(nums[i],i);
        }
       return new int []{};
    }
}