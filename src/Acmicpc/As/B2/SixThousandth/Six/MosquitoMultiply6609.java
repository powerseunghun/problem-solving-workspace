package Acmicpc.As.B2.SixThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MosquitoMultiply6609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int M = 0, P = 0, L = 0, E = 0, R = 0, S = 0, N = 0;
		
		while((str=br.readLine()) != null) {
			M = Integer.parseInt(str.split(" ")[0]);
			P = Integer.parseInt(str.split(" ")[1]);
			L = Integer.parseInt(str.split(" ")[2]);
			E = Integer.parseInt(str.split(" ")[3]);
			R = Integer.parseInt(str.split(" ")[4]);
			S = Integer.parseInt(str.split(" ")[5]);
			N = Integer.parseInt(str.split(" ")[6]);
			
			for (int i = 0, v = 0; i < N; i++) {
				v = M;
				M = P/S;
				P = L/R;
				L = v*E;
			}
			sb.append(M).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
