package Acmicpc.GreedyAlgorithm.TenThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GourdCrush19939 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		for (int i = 1; i <= K; i++) {
			sum += i;
		}
		N -= sum;
		
		if (N < 0) {
			System.out.println("-1");
			return;
		}
		if (N % K == 0) {
			System.out.println(K-1);
		}
		else System.out.println(K);
	}
}
