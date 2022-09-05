package Acmicpc.As.B3.TenThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WholeCalcCount17174 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int cnt = N;
		
		while (N >= M) {
			N = N/M;
			cnt += N;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
