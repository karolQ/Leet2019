package utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode listNodeFromAnArray(int[] nums) {
        ListNode nodes = new ListNode(0);
        ListNode dummy = nodes;

        for(int n : nums) {
            nodes.next = new ListNode(n);
            nodes = nodes.next;
        }
        return dummy.next;
    }
}
