package Acmicpc.As.B3.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProfessorLee10874 {
	static final int l = 10;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		boolean flag = true;
		
		for (int n = 1; n <= N; n++) {
			st = new StringTokenizer(br.readLine());
			flag = true;
			for (int i = 1, v = 0; i <= l; i++) {
				v = Integer.parseInt(st.nextToken());
				if (v != (i-1)%5+1) flag = false;
			}
			if (flag) {
				sb.append(n).append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
