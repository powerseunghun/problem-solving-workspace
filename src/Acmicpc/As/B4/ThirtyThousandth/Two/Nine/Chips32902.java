package Acmicpc.As.B4.ThirtyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chips32902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int k = Integer.parseInt(str.split(" ")[0]);
		int n = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(n+1 " " + (k*n+1));
		br.close();
	}
}
