package LettCode.TwoHundred.Easy;

import java.util.HashMap;
import java.util.Map;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class P141LinkedListCycle {
    static Map<ListNode, Integer> map = new HashMap<>();
    static boolean hasCycle(ListNode head) {
        map.clear();
        if (head==null) return false;
        
        while (head.next != null) {
            if (map.containsKey(head)) return true;
            
            map.put(head, 1);
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
		
	}
}
