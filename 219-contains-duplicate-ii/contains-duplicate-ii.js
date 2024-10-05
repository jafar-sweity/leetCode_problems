var containsNearbyDuplicate = function (nums, k) {
  let myMap = new Map();

  for (let i = 0; i < nums.length; i++) {
    if (myMap.has(nums[i])) {
      if ((i-myMap.get(nums[i]))<= k) {
        return true;
      }
    }
          myMap.set(nums[i], i);

  }
      return false;

};
