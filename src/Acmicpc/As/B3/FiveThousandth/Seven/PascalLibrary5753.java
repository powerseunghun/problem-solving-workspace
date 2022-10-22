package Acmicpc.As.B3.FiveThousandth.Seven;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class PascalLibrary5753 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int N = 0, D = 0;
		boolean flag = false;
		
		while (true) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			D = Integer.parseInt(tmp.split(" ")[1]);
			if (N == 0 && D == 0) break;
			
			arr = new int[N];
			for (int i = 0; i < D; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < arr.length; j++) {
					arr[j] += Integer.parseInt(st.nextToken());
				}
			}
			flag = false;
			for (int el : arr) {
				if (el == D) {
					flag = true;
					break;
				}
			}
			sb.append(flag ? "yes\n" : "no\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
