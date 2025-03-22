package Acmicpc.As.B2.TenThousandth.Seven.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakingBranches17783 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println((n&1) == 0 ? "Alice\n1" : "Bob");
		br.close();
	}
}
