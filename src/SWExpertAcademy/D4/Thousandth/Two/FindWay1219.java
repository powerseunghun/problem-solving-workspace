package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindWay1219 {
	static int[][] arr = null;
	static boolean[] check = null;
	static void search(int v) {
		check[v] = true;
		for (int i = 0; i < arr[v].length; i++) {
			if (arr[v][i] == 1 && !check[i]) {
				search(i);
				check[v] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int from = 0, to = 0;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			arr = new int[100][100];
			check = new boolean[100];
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				from = Integer.parseInt(st.nextToken());
				to = Integer.parseInt(st.nextToken());
				arr[from][to] = 1;
			}
			search(0);
			sb.append("#" + i + " " + (check[99] ? 1 : 0) + "\n");
		}
		System.out.print(sb.toString());
	}
}
