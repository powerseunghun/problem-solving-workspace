package Acmicpc.As.S5.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime1312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), fm = null;
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(str.split(" ")[2]);
		fm = "%." + (N+1) + "f";
		System.out.println(fm);
		
		System.out.println((double)A / B);
		str = String.format(fm, (double)A / B);
		System.out.println("str: " + str);
		System.out.println(str.charAt(str.length()-2));
		br.close();
	}
}
