package LettCode.Hundred.Medium;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class P2AddTwoNumbers {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode root = list;
        int carry = 0, val = 0;
        while (l1 != null && l2 != null) {
            val = l1.val + l2.val + carry;
            if (val >= 10) {
                carry = val / 10;
                val %= 10;
            }
            else carry = 0;
            list.next = new ListNode(val);
            l1 = l1.next;
            l2 = l2.next;
            list = list.next;
        }
        while (l1 != null) {
            val = l1.val + carry;
            if (val >= 10) {
                carry = val / 10;
                val %= 10;
            }
            else carry = 0;
            list.next = new ListNode(val);
            l1 = l1.next;
            list = list.next;
        }
        while (l2 != null) {
            val = l2.val + carry;
            if (val >= 10) {
                carry = val / 10;
                val %= 10;
            }
            else carry = 0;
            list.next = new ListNode(val);
            l2 = l2.next;
            list = list.next;
        }
        if (carry != 0) {
            list.next = new ListNode(carry);
            list = list.next;
        }
        return root.next;
    }
    public static void main(String[] args) {
		
	}
}
