package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Nptest3 {
	static int[] arr = new int[8];
	static boolean[] check = new boolean[8 + 1];
	static List<String> lineList = new ArrayList<String>();

	static void dfs(int n, int d) {
		if (d >= n) {
			String str = "";
			for (int i = 0; i < arr.length; i++) {
				str += (arr[i] + "");
			}
			lineList.add(str);
			return;
		}

		for (int i = 1; i <= 8; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = i;
				dfs(n, d + 1);
				check[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dfs(8, 0);
		String[] conflictList = { "53", "43", "47", "36", "35", "34", "74", "63" };
		int count = 0;
		boolean flag = true;
		for (int i = 0; i < lineList.size(); i++) {
			flag = true;
			for (int j = 0; j < conflictList.length; j++) {
				if (lineList.get(i).contains(conflictList[j])) {
					flag = false;
					break;
				}
			}
			if (flag)
				count++;
		}
		System.out.println(lineList.size());
		System.out.println(count);
	}
}
