package codes;

import utils.ListNode;

public class _024_swapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode cur = head, next = cur.next;
        dummy.next = head;
        head = dummy;

        while(next != null) {
            ListNode nextCur = next.next;
            head.next = cur.next;
            next.next = cur;
            cur.next = nextCur;
            head = cur;
            cur = nextCur;
            next = cur.next;
        }
        return dummy.next;
    }
}
