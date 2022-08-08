package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matchers13222 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int H = Integer.parseInt(tmp.split(" ")[1]);
		int W = Integer.parseInt(tmp.split(" ")[2]), M = 0;
		double d = Math.sqrt(H*H + W*W);
		
		while (N-- > 0) {
			M = Integer.parseInt(br.readLine());
			if (M > d) sb.append("NO\n");
			else sb.append("YES\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
