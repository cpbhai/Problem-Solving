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

class Node {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

class SinglyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }
  push(val) {
    const newNode = new Node(val);
    ++this.length;
    if (this.head == null) {
      this.head = this.tail = newNode;
      return this;
    }
    this.tail.next = newNode;
    this.tail = newNode;
    return this;
  }
  pop() {
    if (this.head == null) return undefined;
    let current = this.head,
      newTail = current;
    while (current.next) {
      newTail = current;
      current = current.next;
    }
    this.tail = newTail;
    this.tail.next = null;
    --this.length;
    return current;
  }
  shift() {
    if (this.head == null) return undefined;
    const currHead = this.head;
    this.head = currHead.next;
    --this.length;
    return currHead;
  }
  unshift(val) {
    const newNode = new Node(val);
    if (this.head == null) {
      this.head = this.tail = newNode;
      return this;
    }
    newNode.next = this.head;
    this.head = newNode;
    ++this.length;
    return this;
  }
  get(index) {
    if (index < 0 || index >= this.length) return null;
    let counter = 0;
    let current = this.head;
    while (counter != index) {
      current = current.next;
      ++counter;
    }
    return current;
  }
  set(index, val) {
    const foundVal = this.get(index);
    if (foundVal) {
      foundVal.val = val;
      return true;
    }
    return false;
  }
  insert(index, val) {
    if (index < 0 || index > this.length) return false;
    ++this.length;
    if (index == this.length) {
      this.push(val);
      return true;
    }
    if (index == 0) {
      this.unshift(val);
      return true;
    }
    const newNode = new Node(val);
    const prev = this.get(index - 1);
    const temp = prev.next;
    prev.next = newNode;
    newNode.next = temp;
    return true;
  }
}

function main() {
  const list = new SinglyLinkedList();
  for (let x = 1; x <= 10; ++x) list.push(x);
  // console.log(list.pop());
  console.log(list);
  list.insert(3, 100);
  console.log(list);
}
