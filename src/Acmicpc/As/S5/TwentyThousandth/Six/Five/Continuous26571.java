package Acmicpc.As.S5.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continuous26571 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long a = Long.parseLong(str.split(" ")[0]);
		long b = Long.parseLong(str.split(" ")[1]);
		long c = Long.parseLong(str.split(" ")[2]);
		long d = Long.parseLong(str.split(" ")[3]);
		
		System.out.println(a*k + b == c*k + d ? "Yes " + (a*k+b) : "No");
		br.close();
	}
}
