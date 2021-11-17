package Goorm.Level4;

public class InorderTraversal {
	static int[] arr = {0, 6, 3, 9, 1, 5, 7, 11};
	static int min = 1, max = 7;
	static boolean validIdx(int idx) {
		if (idx < 1 || idx > 7) return false;
		return true;
	}
	static void inOrder(StringBuilder sb, int idx) {
		if (validIdx(idx*2) && arr[idx*2] != 0) inOrder(sb, idx*2);
		sb.append(arr[idx] + " ");
		if (validIdx(idx*2+1) && arr[idx*2+1] != 0) inOrder(sb, idx*2+1);
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		inOrder(sb, 1);
		
		System.out.print(sb.toString());
		return;
	}
}
