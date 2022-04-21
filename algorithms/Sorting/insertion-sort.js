function insertionSort(a) {
  const n = a.length;
  for (let i = 1; i < n; ++i) {
    const tmp = a[i];
    let j = i - 1;
    while (j >= 0 && a[j] > tmp) {
      a[j + 1] = a[j];
      --j;
    }
    a[j + 1] = tmp;
  }
}
function main() {
  let a = [8, 4, 1, 5, 9, 2];
  insertionSort(a);
  console.log(a);
}
/*
#REFERENCE: https://www.youtube.com/watch?v=wWhAhp6PIuQ
#TIME COMPLEXITY: O(n^2)
#SPACE COMPLEXITY: O(1)
#INPUT SETS:...
#NOTE:It is optimization over bubble sort. it reduces the number of comparisons.
*/
