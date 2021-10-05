package LettCode.Hundred.Easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class P83RemoveDuplicatesFromSortedList {
    static ListNode deleteDuplicates(ListNode head) {
        ListNode list = new ListNode();
        list.val = 101;
        ListNode root = list;
        
        while (head != null) {
            if (list.val != head.val) {
                list.next = new ListNode(head.val);
                list = list.next;
            }
            head = head.next;
        }
        return root.next;
    }
	public static void main(String[] args) {
		
	}
}
