public class Question206 {

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

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Question206 obj = new Question206();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(
            1,
            new ListNode(
                2,
                new ListNode(
                    3,
                    new ListNode(
                        4,
                        new ListNode(5)
                    )
                )
            )
        );

        ListNode result = obj.reverseList(head);

        System.out.print("Reversed List = ");

        while (result != null) {
            System.out.print(result.val);

            if (result.next != null) {
                System.out.print(" -> ");
            }

            result = result.next;
        }

        System.out.println();
    }
}
