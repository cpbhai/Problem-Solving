"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine(type) {
  let line = inputString[currentLine++];
  if (type == "number") line = line.split(/\s+/).map((each) => Number(each));
  else if (type == "int")
    line = line.split(/\s+/).map((each) => parseInt(each));
  else line = line.split(/\s+/);
  return line;
}
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
