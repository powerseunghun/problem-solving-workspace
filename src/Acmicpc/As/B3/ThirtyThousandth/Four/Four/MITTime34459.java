package Acmicpc.As.B3.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MITTime34459 {
	static final int l = 1000000000;
	static int func(int N) {
		int idx = 1;
		while(true) {
			if (Math.pow(5, idx) >= N) {
				return idx;
			} else {
				idx++;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, v = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			v = func(N);
			sb.append("MIT").append(v != 1 ? ("^" + v) : "").append(" time").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
