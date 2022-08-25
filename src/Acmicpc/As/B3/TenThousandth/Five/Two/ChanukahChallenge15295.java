package Acmicpc.As.B3.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanukahChallenge15295 {
	static int func(int N) {
		return N%2 == 0 ? (N+1) * (N/2) : ((N+1) * (N/2)) + (N/2+1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			sb.append(Integer.parseInt(tmp.split(" ")[0]) + " ");
			N = Integer.parseInt(tmp.split(" ")[1]);
			sb.append(func(N)+N + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
