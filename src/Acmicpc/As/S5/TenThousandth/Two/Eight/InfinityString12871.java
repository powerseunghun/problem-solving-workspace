package Acmicpc.As.S5.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfinityString12871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		for (int i = 0; i < str2.length(); i++) {
			sb1.append(str1);
		}
		
		for (int i = 0; i < str1.length(); i++) {
			sb2.append(str2);
		}
		
		System.out.println(sb1.toString().equals(sb2.toString()) ? "1" : "0");
		br.close();
	}
}
