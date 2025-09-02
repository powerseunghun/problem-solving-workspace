package Acmicpc.As.B3.TwentyThousandth.Nine.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome29829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		int d = Integer.parseInt(str.split(" ")[3]);
		
		System.out.println((a!=d && b!=c) ? "EI" : "JAH\n" + a + " " + b + " " + b + " " + a);
		br.close();
	}
}
