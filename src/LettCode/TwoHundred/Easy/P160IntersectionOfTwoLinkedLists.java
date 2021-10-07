package LettCode.TwoHundred.Easy;

import java.util.HashSet;
import java.util.Set;

public class P160IntersectionOfTwoLinkedLists {
    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        Set<ListNode> set = new HashSet<>();
        while (p != null) {
            set.add(p);
            p = p.next;
        }
        p = headB;
        while (p != null){
            if (set.contains(p)) break;
            p = p.next;
        }
        
        return p;
    }
	public static void main(String[] args) {
		
	}
}
