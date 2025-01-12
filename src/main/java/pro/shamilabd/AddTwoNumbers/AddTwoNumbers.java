package pro.shamilabd.AddTwoNumbers;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l12 = new ListNode(3);
        ListNode l112 = new ListNode(4, l12);
        ListNode l1112 = new ListNode(2, l112);
        ListNode l21 = new ListNode(4);
        ListNode l221 = new ListNode(6, l21);
        ListNode l2221 = new ListNode(5, l221);
        System.out.println(addTwoNumbers(l1112, l2221)); // 708
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l22 = new ListNode(9, l2);
        ListNode l222 = new ListNode(9, l22);
        ListNode l2222 = new ListNode(9, l222);
        ListNode l22222 = new ListNode(9, l2222);
        ListNode l222222 = new ListNode(9, l22222);
        ListNode l2222222 = new ListNode(1, l222222);
        System.out.println(addTwoNumbers(l1, l2222222)); // 0000001
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = getValue(l1);
        int val2 = getValue(l2);
        int total = val1 + val2;
        ListNode node = null;
        String text = String.valueOf(total);
        for (int i = 0; i < text.length(); i++) {
            node = new ListNode(text.charAt(i) - '0', node);
        }
        return node;
    }

    public static int getValue(ListNode node) {
        int value = 0;
        int pow = 1;
        while (node != null) {
            value += node.val * pow;
            node = node.next;
            pow = pow * 10;
        }
        return value;
    }
}