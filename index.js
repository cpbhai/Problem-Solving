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

function solve() {}

function main() {}
