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

public class Question141 {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Question141 obj = new Question141();

        // Create:
        // 3 -> 2 -> 0 -> -4
        //      ^         |
        //      |_________|

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle: -4 -> 2
        head.next.next.next.next = head.next;

        boolean result = obj.hasCycle(head);

        System.out.println("Has Cycle: " + result);
    }
}
