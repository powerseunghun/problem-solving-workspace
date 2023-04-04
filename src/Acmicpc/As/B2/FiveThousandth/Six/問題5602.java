package Acmicpc.As.B2.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 問題5602 {
	static int[][] arr = null;
	static int[] cnts = null;
	static boolean[] check = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		StringTokenizer st = null;
		List<Integer> sortCntList = new ArrayList<Integer>();
		arr = new int[n][m];
		cnts = new int[m];
		check = new boolean[m];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0, cnt = 0; i < arr[0].length; i++, cnt = 0) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] != 0) cnt++;
			}
			cnts[i] = cnt;
			sortCntList.add(cnt);
		}
		Collections.sort(sortCntList, Collections.reverseOrder());
		Arrays.fill(check, false);
		
		for (int i = 0; i < sortCntList.size(); i++) {
			for (int j = 0; j < cnts.length; j++) {
				if (cnts[j] == sortCntList.get(i) && !check[j]) {
					sb.append(j+1).append(" ");
					check[j] = true;
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
