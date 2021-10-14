package LettCode.Hundred.Medium;

public class P61RotateList {
    static ListNode rotateRight(ListNode head, int k) {
        if (k == 0) return head;
        else if (head == null) return null;
        ListNode tmp1 = head, tmp2 = null;
        int count = 0;
        while (tmp1 != null) {
            count++;
            tmp1 = tmp1.next;
        }
        if (count == k || count == 1) return head;
        
        k = k % count;
        for (int i = 0; i < k; i++) {
            tmp1 = head;
            tmp2 = tmp1.next;
            while (tmp2.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            tmp2.next = head;
            tmp1.next = null;
            head = tmp2;
        }
        return head;
    }
	public static void main(String[] args) {
		
	}
}
