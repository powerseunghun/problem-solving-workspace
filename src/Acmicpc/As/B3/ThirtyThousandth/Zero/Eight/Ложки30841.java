package Acmicpc.As.B3.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ложки30841 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long a = Long.parseLong(str.split(" ")[0]);
		long b = Long.parseLong(str.split(" ")[1]);
		
		System.out.println(a==0||b==0 ? "0" : (a*b/(a+b)));
		br.close();
	}
}
