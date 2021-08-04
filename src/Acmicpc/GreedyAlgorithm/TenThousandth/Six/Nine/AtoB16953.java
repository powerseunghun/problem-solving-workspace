package Acmicpc.GreedyAlgorithm.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtoB16953 {
	static int answer = Integer.MAX_VALUE;
	static void f(long a, long b, int count) {
		if (a > b) return;
		
		if (a == b) {
			answer = Math.min(count, answer);
			return;
		}
		f(a*2, b, count+1);
		f(a*10+1, b, count+1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long.parseLong(tmp.split(" ")[0]), B = Long.parseLong(tmp.split(" ")[1]);
		
		f(A, B, 1);
		
		System.out.println(answer == Integer.MAX_VALUE ? -1 : answer); 
	}
}
