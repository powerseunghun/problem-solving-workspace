package Acmicpc.As.B2.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BobIdiot34009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.readLine();
		
		System.out.println((N&1) != 0 ? "Bob" : "Alice");
		br.close();
	}
}
