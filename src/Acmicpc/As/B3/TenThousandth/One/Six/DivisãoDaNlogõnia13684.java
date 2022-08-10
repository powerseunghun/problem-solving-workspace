package Acmicpc.As.B3.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisãoDaNlogõnia13684 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = 0, N = 0, M = 0, X = 0, Y = 0;
		String tmp = null;
		
		while (true) {
			K = Integer.parseInt(br.readLine());
			if (K == 0) break;
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			
			for (int i = 0; i < K; i++) {
				tmp = br.readLine();
				X = Integer.parseInt(tmp.split(" ")[0]);
				Y = Integer.parseInt(tmp.split(" ")[1]);
				if (X == N || Y == M) sb.append("divisa\n");
				else if (X < N && Y > M) sb.append("NO\n");
				else if (X > N && Y > M) sb.append("NE\n");
				else if (X < N && Y < M) sb.append("SO\n");
				else if (X > N && Y < M) sb.append("SE\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
