class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Question160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        Question160 obj = new Question160();

        // Common part:
        // 8 -> 4 -> 5

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A:
        // 4 -> 1 -> 8 -> 4 -> 5

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B:
        // 5 -> 6 -> 1 -> 8 -> 4 -> 5

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = obj.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node = " + result.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}
