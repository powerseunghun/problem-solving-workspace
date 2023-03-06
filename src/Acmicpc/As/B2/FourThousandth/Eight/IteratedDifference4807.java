package Acmicpc.As.B2.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IteratedDifference4807 {
	static int[] arr = null, nArr = null;
	static boolean check(boolean flag) {
		int base = flag ? arr[0] : nArr[0];
		if (flag) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != base) return false;
			}
		}
		else {
			for (int i = 1; i < nArr.length; i++) {
				if (nArr[i] != base) return false;
			}
		}
		return true;
	}
	static String func(int N) {
		boolean flag = true;
		int res = 0;
		while(true) {
			if (res >= 1000 || check(flag)) break;
			res++;
			if (!flag) {
				for (int i = 0; i < arr.length; i++) {
					arr[i] = nArr[i];
				}
			}
			for (int i = 0; i < arr.length; i++) {
				nArr[i] = Math.abs(arr[i]-arr[(i+1)%N]);
			}
			flag = false;
		}
		if (res >= 1000) return "not attained";
		else return res + " iterations";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0;
		String tmp = null;
		
		for (int i = 1; ; i++) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			arr = new int[N];
			nArr = new int[N];
			tmp = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			sb.append("Case ").append(i).append(": ").append(func(N)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
