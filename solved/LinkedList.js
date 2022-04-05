class Node {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}
class LL {
  constructor() {
    this.head = null;
  }
  push(data) {
    //O(N)
    if (this.head == null) return (this.head = new Node(data));
    let dummy = this.head;
    while (dummy.next) {
      dummy = dummy.next;
    }
    dummy.next = new Node(data);
  }
  append(data) {
    //O(1)
    if (this.head == null) return (this.head = new Node(data));
    const temp = new Node(data);
    temp.next = this.head;
    this.head = temp;
  }
  print() {
    let dummy = this.head;
    while (dummy) {
      console.log(dummy.val);
      dummy = dummy.next;
    }
  }
}

let ll = new LL();
for (let i = 1; i <= 10; ++i) ll.append(i);
ll.print();
