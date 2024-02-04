package Acmicpc.As.B5.TwentyThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PublicTranspoft28113 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[1]);
		int B = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println(A == B ? "Anything" : A > B ? "Subway" : "Bus");
		br.close();
	}
}
