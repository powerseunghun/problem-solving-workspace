package Acmicpc.As.B2.TenThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheCowSignal14175 {
	static Character[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			for (int j = 0; j < K; j++) {
				for (int k = 0; k < tmp.length(); k++) {
					for (int l = 0; l < K; l++) {
						sb.append(tmp.charAt(k));
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
