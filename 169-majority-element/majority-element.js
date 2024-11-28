/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let myMap=new Map()

    for (let i=0;i<nums.length;i++)
    {
        if(!myMap.has(nums[i]))
        {
            myMap.set(nums[i],1)
        }
        else {
            myMap.set(nums[i],myMap.get(nums[i])+1)
        }
    }
    console.log(myMap)
     let maxValue=0;
     let k=0;
      for (let key of myMap.keys()) {
        let value = myMap.get(key);
        if(!maxValue || maxValue < value)
        {
            maxValue=value;
            k=key;
        }
        else{
            maxValue=maxValue;
        }
           
      }
      return k;
    

};