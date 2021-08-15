package Acmicpc.BruteForceAlgorithm.TenThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseGugudan13410 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = null;
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE;
		
		for (int i = 1, val = 0; i <= K; i++) {
			val = N * i;
			sb = new StringBuffer(val+"");
			max = Math.max(max, Integer.parseInt(sb.reverse().toString()));
		}
		
		System.out.println(max);
	}
}
