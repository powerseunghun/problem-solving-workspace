package Acmicpc.As.B3.TwentyThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigData26264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int A = 0, B = 0;
		
		A = str.replaceAll("bigdata", "").length()/8;
		B = str.replaceAll("security", "").length()/7;
		
		System.out.println(A==B ? "bigdata? security!" : A > B ? "security!" : "bigdata?");
		br.close();
	}
}
