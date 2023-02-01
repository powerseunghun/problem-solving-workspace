package Acmicpc.As.B2.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnePiece12780 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String H = br.readLine(), N = br.readLine();
		
		System.out.println((int)((H.length()-H.replaceAll(N, "").length()) / N.length()));
		br.close();
	}
}
