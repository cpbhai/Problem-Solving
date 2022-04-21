function swap(a, i, j) {
  const tmp = a[i];
  a[i] = a[j];
  a[j] = tmp;
}
function selectionSort(a) {
  const n = a.length;
  let i, j, min_idx;
  for (i = 0; i < n - 1; ++i) {
    min_idx = i;
    for (j = i + 1; j < n; ++j) {
      if (a[j] < a[min_idx]) {
        min_idx = j;
      }
    }
    if (min_idx != i) swap(a, min_idx, i);
  }
}

function main() {
  let a = [8, 4, 1, 5, 9, 2];
  selectionSort(a);
  console.log(a);
}
/*
#REFERENCE: Udemy Course
#TIME COMPLEXITY: O(n^2)
#SPACE COMPLEXITY: O(1)
#INPUT SETS:...
#NOTE:It is optimization over bubble sort. it reduces the number of comparisons.
*/
