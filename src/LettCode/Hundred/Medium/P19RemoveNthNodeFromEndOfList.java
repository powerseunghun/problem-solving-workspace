package LettCode.Hundred.Medium;

public class P19RemoveNthNodeFromEndOfList {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        
        for (int i = 0; i < n; i++) {
        	if (p2.next == null) {
        		head = i == (n-1) ? head.next : head;
        		return head;
        	}
        	p2 = p2.next;
        }
        while (p2.next != null) {
        	p1 = p1.next;
        	p2 = p2.next;
        }
        if (p1.next != null) {
        	p1.next = p1.next.next;
        }
        return head;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		
		ListNode ln = removeNthFromEnd(head, 2);
		while(ln != null) {
			System.out.print(ln.val + " ");
			ln = ln.next;
		}
		System.out.println();
	}
}
