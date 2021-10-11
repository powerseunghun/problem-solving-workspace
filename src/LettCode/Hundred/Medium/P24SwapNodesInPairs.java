package LettCode.Hundred.Medium;

public class P24SwapNodesInPairs {
    static ListNode swapPairs(ListNode head) {
        int length = 0;
        ListNode tmp = head;
        ListNode p1 = head, p2 = null;
        
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        for (int i = 0, val = 0; i < length/2; i++) {
            p2 = p1.next;
            val = p1.val;
            p1.val = p2.val;
            p2.val = val;
            p1 = p2.next;
        }
        
        return head;
    }
	public static void main(String[] args) {
		
	}
}
