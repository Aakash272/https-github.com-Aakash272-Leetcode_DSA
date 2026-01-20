class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        ArrayList<Integer> ap = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            ap.add(curr.val);
            curr = curr.next;
        }

        int n = ap.size();
        k = k % n;   
        if (k == 0) return head;

        ListNode dummy = new ListNode(0);
        ListNode tp = dummy;
        for (int i = n - k; i < n; i++) {
            tp.next = new ListNode(ap.get(i));
            tp = tp.next;
        }

        for (int i = 0; i < n - k; i++) {
            tp.next = new ListNode(ap.get(i));
            tp = tp.next;
        }

        return dummy.next;
    }
}
