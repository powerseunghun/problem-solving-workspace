package LettCode.Hundred.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P82RemoveDuplicatesFromSortedList2 {
	static Map<Integer, Integer> map = new HashMap<>();
	static Set<Integer> set = new HashSet<>();
    static ListNode deleteDuplicates(ListNode head) {
    	map.clear();
    	set.clear();
    	if (head == null) return null;
    	ListNode tmp = head;
    	while (tmp != null) {
    		if (map.containsKey(tmp.val)) {
    			set.add(tmp.val);
    		}
    		else map.put(tmp.val, 1);
    		tmp = tmp.next;
    	}
    	ListNode returnList = null;
    	
    	while (head != null) {
    		if (!set.contains(head.val)) {
    			if (returnList == null) {
    				returnList = new ListNode(head.val);
    			}
    			else {
    				ListNode tList = returnList;
    				while (tList.next != null) {
    					tList = tList.next;
    				}
    				tList.next = new ListNode(head.val);
    			}
    		}
    		head = head.next;
    	}
    	return returnList;
    }
	public static void main(String[] args) {
		int[] t = {1};
		ListNode head = new ListNode(1);
		ListNode tmp = head;
		
		for (int i = 0; i < t.length; i++) {
			tmp.next = new ListNode(t[i]);
			tmp = tmp.next;
		}
		
		tmp = deleteDuplicates(head);
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}
