package dailychallenge.Day48;

import java.util.Arrays;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};

        System.out.print(Arrays.toString(reverseList(head)));
    }
    public static <ListNode> ListNode reverseList(ListNode head) {

        ListNode pre = null;

        ListNode curnext = head;

        while(curnext != null)
        {
            ListNode temp = curnext;

            curnext = pre;

            pre = curnext;

            curnext = temp;
        }
        return pre;
    }
}
