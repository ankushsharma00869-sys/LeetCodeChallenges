class Solution {

    public ListNode middleOfLL(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        return slow;
    }

    public ListNode reverseOfLL(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public boolean isPalindrome(ListNode head) {

        // 1. Find middle
        ListNode list2 = middleOfLL(head);

        // 2. Reverse second half
        ListNode head2 = reverseOfLL(list2);

        // 3. Compare
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while (temp2 != null) {

            if (temp1.val != temp2.val) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }
}