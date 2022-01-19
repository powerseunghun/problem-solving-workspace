package Acmicpc.OrderSubmit.TwoThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompetitionOrInternShip2875 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]), count = 0, max = Integer.MIN_VALUE;
		
		while (true) {
			N -= 2;
			M -= 1;
			if (N+M < K || N < 0 || M < 0) break;
			count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
