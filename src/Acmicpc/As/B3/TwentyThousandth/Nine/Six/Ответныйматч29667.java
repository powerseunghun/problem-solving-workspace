package Acmicpc.As.B3.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ответныйматч29667 {
	static boolean func(String str1, String str2) {
		int h1 = Integer.parseInt(str1.substring(0, 1));
		int h2 = Integer.parseInt(str1.substring(2, 3));
		int a1 = Integer.parseInt(str2.substring(0, 1));
		int a2 = Integer.parseInt(str2.substring(2, 3));
		return h1>=a1 && h2>=a2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(func(str1, str2) ? "YES" : "NO");
		br.close();
	}
}
