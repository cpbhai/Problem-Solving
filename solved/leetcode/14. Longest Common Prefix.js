//Link: https://leetcode.com/problems/longest-common-prefix/
function findMinLength(arr, n) {
  let min = arr[0].length;
  for (let i = 1; i < n; i++) {
    if (arr[i].length < min) {
      min = arr[i].length;
    }
  }

  return min;
}

function commonPrefix(arr, n) {
  let minlen = findMinLength(arr, n);
  let result = ""; // Our resultant string
  let current; // The current character
  for (let i = 0; i < minlen; i++) {
    // Current character (must be same
    // in all strings to be a part of
    // result)
    current = arr[0][i];

    for (let j = 1; j < n; j++) {
      if (arr[j][i] != current) {
        return result;
      }
    }

    // Append to result
    result += current;
  }

  return result;
}
var longestCommonPrefix = function (strs) {
  return commonPrefix(strs, strs.length);
};
