public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Find length of A
        int lenA = 0;
        ListNode a = headA;

        while (a != null) {
            lenA++;
            a = a.next;
        }

        // Find length of B
        int lenB = 0;
        ListNode b = headB;

        while (b != null) {
            lenB++;
            b = b.next;
        }

        // Find difference
        int diff = Math.abs(lenA - lenB);

        // Move longer list ahead
        if (lenA > lenB) {

            while (diff > 0) {
                headA = headA.next;
                diff--;
            }

        } else {

            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        // Now both are at same distance from intersection
        while (headA != null && headB != null) {

            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}