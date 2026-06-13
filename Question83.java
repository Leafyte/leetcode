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

public class Question83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {

                current.next = current.next.next;
            }

            else {

                current = current.next;
            }
        }

        return head;
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

        Question83 obj = new Question83();

        ListNode head = new ListNode(1,
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(3)))));

        ListNode result = obj.deleteDuplicates(head);

        printList(result);
    }
}
