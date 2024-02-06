package Acmicpc.As.B5.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDigitInteger27331 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()) * 10;
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A+B);
		br.close();
	}
}
