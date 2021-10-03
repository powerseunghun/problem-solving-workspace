package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOrder1231 {
	static char[] arr = null;
	static void inorder(int v, int n, StringBuilder sb) {
		if (v <= n) {
			inorder(2*v, n, sb);
			sb.append(arr[v]);
			inorder(2*v+1, n, sb);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = 0;
		
		for (int i = 1; i <= 10; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new char[N+1];
			sb.append("#" + i + " ");
			for (int j = 1; j < arr.length; j++) {
				tmp = br.readLine();
				arr[j] = tmp.split(" ")[1].charAt(0);
			}
			inorder(1, N, sb);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
