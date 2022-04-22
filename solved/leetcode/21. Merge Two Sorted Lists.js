//Link: https://leetcode.com/problems/merge-two-sorted-lists/
var mergeTwoLists = function (list1, list2) {
  let ans = new ListNode(-1),
    dummy = ans;
  while (list1 && list2) {
    if (list1.val <= list2.val) {
      ans.next = list1;
      list1 = list1.next;
    } else {
      ans.next = list2;
      list2 = list2.next;
    }
    ans = ans.next;
  }
  while (list1) {
    ans.next = list1;
    ans = ans.next;
    list1 = list1.next;
  }
  while (list2) {
    ans.next = list2;
    ans = ans.next;
    list2 = list2.next;
  }
  return dummy.next;
};
