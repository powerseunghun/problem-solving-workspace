package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DominoGame {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int count = 0;
	static void search(int p) {
		count++;
		for (int i = 1; i < arr[p].length; i++) {
			if (arr[p][i] != 0 && !check[p][i]) {
				check[p][i] = true;
				search(i);
			}
 		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]), sum = 0;
		arr = new int[a+1][a+1];
		check = new boolean[a+1][a+1];
		
		for (int i = 0, p1 = 0, p2 = 0; i < b; i++) {
			tmp = br.readLine();
			p1 = Integer.parseInt(tmp.split(" ")[0]);
			p2 = Integer.parseInt(tmp.split(" ")[1]);
			arr[p1][p2] = 1;
		}
		
		for (int i = 0, p = 0; i < c; i++) {
			count = 0;
			p = Integer.parseInt(br.readLine());
			search(p);
			sum += count;
		}
		
		System.out.println(sum);
		
		br.close();
	}
}
