package Acmicpc.As.B4.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checkers21631 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long a = Long.parseLong(tmp.split(" ")[0]);
		long b = Long.parseLong(tmp.split(" ")[1]);
		
		System.out.println(a >= b ? b : a+1);
		br.close();
	}
}
