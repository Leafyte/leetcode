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

public class Question86 {

    public ListNode partition(ListNode head, int x) {

        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode large = largeDummy;

        while (head != null) {

            if (head.val < x) {

                small.next = head;
                small = small.next;
            }

            else {

                large.next = head;
                large = large.next;
            }

            head = head.next;
        }

        // End the large list
        large.next = null;

        // Connect both lists
        small.next = largeDummy.next;

        return smallDummy.next;
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

        Question86 obj = new Question86();

        ListNode head = new ListNode(1,
                new ListNode(4,
                new ListNode(3,
                new ListNode(2,
                new ListNode(5,
                new ListNode(2))))));

        int x = 3;

        ListNode result = obj.partition(head, x);

        printList(result);
    }
}
