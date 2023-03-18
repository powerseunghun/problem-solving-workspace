package Acmicpc.As.B2.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bakugan5678 {
	static int[] arr = new int[2], sr = new int[2];
	static boolean check[] = new boolean[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int R = 0, pre = 0, sc = 0, cur = 0;
		
		while(true) {
			R = Integer.parseInt(br.readLine());
			if (R == 0) break;
			Arrays.fill(arr, 0);
			Arrays.fill(sr, 0);
			Arrays.fill(check, false);
			for (int i = 0; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				sc = 1; pre = 0;
				for (int j = 0; j < R; j++) {
					cur = Integer.parseInt(st.nextToken());
					arr[i] += cur;
					if (pre == cur) {
						sc++;
						if (sc == 3) {
							check[i] = true;
							sr[i] = j;
						}
					}
					else sc = 1;
					pre = cur;
				}
			}
			if (check[0] && check[1]) {
				if (sr[0] != sr[1]) {
					if (sr[0] < sr[1]) {
						arr[0]+=30;
					}
					else arr[1] += 30;
				}
			}
			else if (check[0] && !check[1]) {
				arr[0] += 30;
			}
			else if (!check[1] && check[0]) {
				arr[1] += 30;
			}
			sb.append(arr[0] == arr[1] ? "T" : arr[0] > arr[1] ? "M" : "L").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
