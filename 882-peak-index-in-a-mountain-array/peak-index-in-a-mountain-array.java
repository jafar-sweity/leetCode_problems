class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index=0;
        int max=0;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        return index;

    }
}