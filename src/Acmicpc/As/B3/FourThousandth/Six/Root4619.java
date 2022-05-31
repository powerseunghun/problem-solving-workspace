package Acmicpc.As.B3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Root4619 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int B = 0, N = 0, w = 0;
		
		while (true) {
			tmp = br.readLine();
			B = Integer.parseInt(tmp.split(" ")[0]);
			N = Integer.parseInt(tmp.split(" ")[1]);
			if (B == 0 && N == 0) break;
			w = 0;
			while (Math.pow(w, N) < B) {
				w++;
			}
			if (Math.abs(B-Math.pow(w, N)) < Math.abs(B-Math.pow(w-1, N))) {
				sb.append(w);
			}
			else sb.append(w-1);
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
