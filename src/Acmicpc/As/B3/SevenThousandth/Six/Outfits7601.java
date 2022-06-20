package Acmicpc.As.B3.SevenThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Outfits7601 {
	static int[] arr1 = null, arr2 = null;
	static boolean check(int a, int b) {
		int cnt1 = 0, cnt2 = 0, idx1 = 0, idx2 = 0;
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] == Integer.MAX_VALUE) continue;
			if (++cnt1 == a) {
				idx1 = i;
				break;
			}
		}
		for (int i = arr2.length-1; i >= 1; i--) {
			if (arr2[i] == Integer.MAX_VALUE) continue;
			if (++cnt2 == b) {
				idx2 = i;
				break;
			}
		}
		return idx1==idx2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int n = 0, d = 0, idx = 1;
		
		while (true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			if (n == 0 && d == 0) break;
			arr1 = new int[n+1];
			arr2 = new int[n+1];
			arr1[Integer.parseInt(br.readLine())] = Integer.MAX_VALUE;
			arr2[Integer.parseInt(br.readLine())] = Integer.MAX_VALUE;
			
			sb.append("Scenario " + (idx++) + "\n");
			for (int i = 1; i <= d; i++) {
				sb.append("Day " + i + " ");
				tmp = br.readLine();
				sb.append(check(Integer.parseInt(tmp.split(" ")[0]), Integer.parseInt(tmp.split(" ")[1])) ? "ALERT" : "OK");
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
