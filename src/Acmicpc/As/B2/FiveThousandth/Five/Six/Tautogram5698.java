package Acmicpc.As.B2.FiveThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tautogram5698 {
	static String func(String str) {
		char c = str.charAt(0);
		for (int i = 1; i < str.split(" ").length; i++) {
			if (c != str.split(" ")[i].charAt(0)) return "N";
		}
		return "Y";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while(true) {
			str = br.readLine().toLowerCase();
			if (str.equals("*")) break;
			sb.append(func(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
