package Acmicpc.As.B5.ThirtyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UOSString32929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "SUO";
		int x = Integer.parseInt(br.readLine());
		
		System.out.println(str.charAt(x%str.length()));
		br.close();
	}
}
