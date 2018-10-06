public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode list;
        if (l1.val <= l2.val) {
            list = l1;
            list.next = mergeTwoLists(l1.next, l2);
        }
        else {
            list = l2;
            list.next = mergeTwoLists(l1, l2.next);
        }
        return list;
    }
}
