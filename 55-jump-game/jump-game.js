/**
 * @param {number[]} nums
 * @return {boolean}
 */
// Jump Game to determine if you can reach the last index.
var canJump = function (nums) {
  let can = true;


  if (nums.length === 1) {
    return can;
  }
  
    let max = 0;
    for (let i = 0; i < nums.length; i++) {
      if (i > max) {
        can = false;
        break;
      }
      max = Math.max(max, i + nums[i]);
    }   
  return can;
};
