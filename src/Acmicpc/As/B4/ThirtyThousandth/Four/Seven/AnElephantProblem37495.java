package Acmicpc.As.B4.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnElephantProblem37495 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int m = Integer.parseInt(str.split(" ")[0]);
		int d = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println((m+d-1) / m);
		br.close();
	}
}
