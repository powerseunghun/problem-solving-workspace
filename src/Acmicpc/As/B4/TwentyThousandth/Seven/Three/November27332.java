package Acmicpc.As.B4.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class November27332 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A+B*7 > 30 ? "0" : "1");
		br.close();
	}
}
