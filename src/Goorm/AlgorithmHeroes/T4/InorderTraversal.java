package Goorm.AlgorithmHeroes.T4;

public class InorderTraversal {
	static boolean validIdx(int idx) {
		if (idx < 1 || idx > 7) return false;
		return true;
	}
	static void inOrder(int[] arr, StringBuilder sb, int idx) {
		if (validIdx(idx*2) && arr[idx*2] != 0) inOrder(arr, sb, idx*2);
		sb.append(arr[idx] + " ");
		if (validIdx(idx*2+1) && arr[idx*2+1] != 0) inOrder(arr, sb, idx*2+1);
	}
	public static void main(String[] args) {
		int[] arr = {0, 6, 3, 9, 1, 5, 7, 11};
		StringBuilder sb = new StringBuilder();
		inOrder(arr, sb, 1);
		
		System.out.println(sb.toString());
	}
}
