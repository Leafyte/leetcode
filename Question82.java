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

public class Question82 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {

            // Duplicate found
            if (current.next != null &&
                current.val == current.next.val) {

                // Skip all duplicates
                while (current.next != null &&
                       current.val == current.next.val) {

                    current = current.next;
                }

                prev.next = current.next;
            }

            else {

                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Question82 obj = new Question82();

        ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(3,
                new ListNode(4,
                new ListNode(4,
                new ListNode(5)))))));

        ListNode result = obj.deleteDuplicates(head);

        printList(result);
    }
}
