package Goorm.Level4;

public class PreorderTraversal {
	static int[] arr = {0, 6, 3, 9, 1, 5, 7, 11};
	static boolean isValid(int idx) {
		if (idx < 0 || idx > arr.length-1) return false;
		return true;
	}
	static void postOrder(StringBuilder sb, int idx) {
		sb.append(arr[idx] + " ");
		if (isValid(idx*2) && arr[idx*2] != 0) postOrder(sb, idx*2);
		if (isValid(idx*2+1) && arr[idx*2+1] != 0) postOrder(sb, idx*2+1);
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		postOrder(sb, 1);
		
		System.out.print(sb.toString());
	}
}
