package Acmicpc.As.B3.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PongdangPongdang17944 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int T = Integer.parseInt(tmp.split(" ")[1]);
		int h = 1, w = 1;
		
		for (int i = 1; i < T; i++) {
			h+=w;
			if (h == 1 || h == 2*N) {
				w = h == 1 ? 1 : -1;
			}
		}
		
		System.out.println(h);
		br.close();
	}
}
