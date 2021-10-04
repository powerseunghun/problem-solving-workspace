package LettCode.Hundred.Easy;

/**
 * 
 * * Definition for singly-linked list.
 *
 */
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; };
	ListNode(int val, ListNode next) { this.val = val; this.next = next; };
}
public class P21MergeTwoSortedLists {
	static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode head = list;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                list.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                list.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            list = list.next;
        }
        
        while (l1 != null) {
            list.next = new ListNode(l1.val);
            l1 = l1.next;
            list = list.next;
        }
        while (l2 != null) {
            list.next = new ListNode(l2.val);
            l2 = l2.next;
            list = list.next;
        }
        return head.next;
    }
	public static void main(String[] args) {
		
	}
}
