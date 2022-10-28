package Acmicpc.As.B3.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgMedianProblem5691 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long A = 0, B = 0;
		String tmp = null;
		
		while(true) {
			tmp = br.readLine();
			A = Long.parseLong(tmp.split(" ")[0]);
			B = Long.parseLong(tmp.split(" ")[1]);
			if (A == 0 && B == 0) break;
			
			sb.append(A-(B-A) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
