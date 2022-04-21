function mergeArray(a, l, mid, r) {
  let i = l,
    j = mid + 1,
    k = l,
    b = [];
  for (let x = 0; x < r; ++x) b.push(0);
  while (i <= mid && j <= r) {
    if (a[i] < a[j]) {
      b[k++] = a[i];
      ++i;
    } else {
      b[k++] = a[j];
      ++j;
    }
  }
  if (i > mid) {
    while (j <= r) {
      b[k++] = a[j++];
    }
  } else {
    while (i <= mid) {
      b[k++] = a[i++];
    }
  }
  for (k = l; k <= r; ++k) {
    a[k] = b[k];
  }
}

function mergeSort(a, l, r) {
  if (l < r) {
    const mid = parseInt((l + r) / 2);
    mergeSort(a, l, mid);
    mergeSort(a, mid + 1, r);
    mergeArray(a, l, mid, r);
  }
}

function main() {
  let a = [8, 4, 1, 5, 9, 2];
  mergeSort(a, 0, a.length - 1);
  console.log(a);
}
/*
#REFERENCE: https://www.youtube.com/watch?v=aDX3MFL0tYs
#TIME COMPLEXITY: O(nLogn)
#SPACE COMPLEXITY: O(n)
#INPUT SETS:...
#NOTE:Used where space is not the constraint, but the time is.
*/
