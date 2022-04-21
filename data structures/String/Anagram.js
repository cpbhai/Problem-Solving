function isAnagram(str1, str2) {
  if (str1.length != str2.length) return false; //Base Case
  const n = str1.length;
  let charMap = {};
  for (let i = 0; i < n; ++i) {
    if (charMap[str1[i]] == undefined) charMap[str1[i]] = 0;
    if (charMap[str2[i]] == undefined) charMap[str2[i]] = 0;
    --charMap[str1[i]];
    ++charMap[str2[i]];
  }
  return Object.values(charMap).every((val) => val === 0);
}

function main() {
  const str1 = "Aabsd",
    str2 = "abdsA";
  const output = isAnagram(str1, str2);
  if (output) console.log("Yes");
  else console.log("No");
}
main();

/*
#REFERENCE: https://github.com/krnbatra/ACM-ICPC-Algorithms/blob/master/String/Anagram/is_anagram.cpp
#TIME COMPLEXITY: O(2*n) => O(n)
#SPACE COMPLEXITY: O(n)
#INPUT SETS:[
  "absddad", "Adafsdff",
  "Sdfsdfsf", "fsfdfsdF",
  "Sdfsdfsf", "fsfdfsdS"
]
#NOTE:...
*/
