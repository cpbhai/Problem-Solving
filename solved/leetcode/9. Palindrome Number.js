//Link: https://leetcode.com/problems/palindrome-number/
var isPalindrome = function (num) {
  if (num < 0) return false;
  if (num == 0) return true;
  const tmp = num;
  let length = Math.pow(10, parseInt(Math.log10(num)));
  let reverse = 0;
  while (num > 0) {
    const digit = num % 10;
    reverse += digit * length;
    length = parseInt(length / 10);
    num = parseInt(num / 10);
  }
  return reverse == tmp;
};
