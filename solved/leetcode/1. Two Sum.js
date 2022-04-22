//Link: https://leetcode.com/problems/two-sum/
var twoSum = function (arr, target) {
  let map = {};
  let n = arr.length;
  for (let i = 0; i < n; ++i) {
    const exists = map[target - arr[i]];
    if (exists != undefined) {
      return [exists, i];
    } else map[arr[i]] = i;
  }
  return [-1, -1];
};
