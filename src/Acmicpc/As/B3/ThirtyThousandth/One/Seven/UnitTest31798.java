package Acmicpc.As.B3.ThirtyThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnitTest31798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println(c == 0 ? (int)Math.sqrt(a+b) : (int)(Math.pow(c, 2)-a-b));
		br.close();
	}
}
