package Acmicpc.As.B3.TwentyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DevilSuggestion23972 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long K = Long.parseLong(tmp.split(" ")[0]);
		long N = Long.parseLong(tmp.split(" ")[1]);
		
		// (X - K) * N >= X
		// (K*N)/(N-1) = X     (K*N)%(N-1) != 0 += 1
		System.out.println(N==1 ? -1 : ((K*N)/(N-1)) + ((K*N)%(N-1) != 0 ? 1 : 0));
		br.close();
	}
}
