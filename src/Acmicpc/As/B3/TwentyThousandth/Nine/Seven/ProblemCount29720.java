package Acmicpc.As.B3.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemCount29720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int K = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println(Math.max(0, N-M*K) + " " + Math.max(0, N-M*(K-1)-1));
		br.close();
	}
}
