public class Question203 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        // Dummy node handles deletion of the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {

            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Question203 obj = new Question203();

        /*
            1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6

            Remove 6

            1 -> 2 -> 3 -> 4 -> 5
        */

        ListNode head = new ListNode(
            1,
            new ListNode(
                2,
                new ListNode(
                    6,
                    new ListNode(
                        3,
                        new ListNode(
                            4,
                            new ListNode(
                                5,
                                new ListNode(6)
                            )
                        )
                    )
                )
            )
        );

        int val = 6;

        ListNode result = obj.removeElements(head, val);

        System.out.print("After Removal = ");

        while (result != null) {
            System.out.print(result.val);

            if (result.next != null) {
                System.out.print(" -> ");
            }

            result = result.next;
        }
    }
}
