package LettCode.Hundred.Medium;

public class P92ReverseLinkedList2 {
    static ListNode reverseBetween(ListNode head, int left, int right) {
    	if (head == null || left == right) return head;
    	ListNode resList = new ListNode();
    	resList.next = head;
    	ListNode s = resList;
    	ListNode e = null, tmp = null;
    	for (int i = 0; i < left-1; i++) {
    		s = s.next;
    	}
    	e = s.next;
    	for (int i = 0; i < right-left; i++) {
    		tmp = s.next;
    		s.next = e.next;
    		e.next = e.next.next;
    		s.next.next = tmp;
    	}
    	return resList.next;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		ListNode head = null;
		ListNode tmp = null;
		for (int i = 0; i < arr.length; i++) {
			if (head == null) {
				head = new ListNode(arr[i]);
				tmp = head;
			}
			else {
				tmp.next = new ListNode(arr[i]);
				tmp = tmp.next;
			}
		}
		tmp = reverseBetween(head, 2, 4);
		while (tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
 	}
}
