class Solution {
    public boolean containsDuplicate(int[] nums) {

    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

    for (int i =0; i<nums.length;i++)
    {
        
        hmap.put(nums[i] ,hmap.getOrDefault(nums[i], 0)+1);

       

        if ( hmap.get(nums[i]) > 1)
        return true;

    }
    return false; 

        
    }
}