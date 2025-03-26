package Acmicpc.As.B2.ThirtyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bitcoin32952 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long R = Long.parseLong(str.split(" ")[0]);
		long K = Long.parseLong(str.split(" ")[1]);
		long M = Long.parseLong(str.split(" ")[2]);
		
		for (long i = 0; i < M/K; i++) {
			R >>= 1;
			if (R == 0) break;
		}
		System.out.println(R);
		br.close();
	}
}
