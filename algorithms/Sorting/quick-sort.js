function swap(a, x, y) {
  const tmp = a[x];
  a[x] = a[y];
  a[y] = tmp;
}

function partition(a, l, h) {
  const pivot = a[l];
  let i = l,
    j = h;
  while (i < j) {
    while (a[i] <= pivot) i++;
    while (a[j] > pivot) j--;
    if (i < j) swap(a, i, j);
  }
  swap(a, j, l);
  return j;
}

function quickSort(a, l, h) {
  if (l < h) {
    const pivot = partition(a, l, h);
    quickSort(a, l, pivot - 1);
    quickSort(a, pivot + 1, h);
  }
}

function main() {
  let a = [4, 6, 2, 5, 7, 9, 1, 3];
  quickSort(a, 0, a.length - 1);
  console.log(a);
}
/*
  #REFERENCE: https://www.youtube.com/watch?v=UA_Rmjfj4bw
  #TIME COMPLEXITY: O(nLogn)
  #SPACE COMPLEXITY: O(1)
  #INPUT SETS:...
  #NOTE:Used where space is the constraint as well as the time.
  */
