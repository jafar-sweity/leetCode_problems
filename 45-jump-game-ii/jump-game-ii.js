/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function (nums) {
  let jumps = 0;
  let max = 0;
  let currentEnd = 0;

  for (let i = 0; i < nums.length - 1; i++) {
    max = Math.max(max,i+nums[i])
    if (i==currentEnd)
    {
        jumps++;
        currentEnd=max
    }
  }
  return jumps;
};
