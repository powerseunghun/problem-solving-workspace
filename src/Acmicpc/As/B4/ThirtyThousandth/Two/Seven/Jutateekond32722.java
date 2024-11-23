package Acmicpc.As.B4.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jutateekond32722 {
	static final int c = 3;
	static boolean check(String str) {
		if (str.length() != c) return false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch(i) {
			case 0:
				if (!(ch=='1' || ch=='3')) return false;
				break;
			case 1:
				if (!(ch=='6' || ch=='8')) return false;
				break;
			case 2:
				if (!(ch=='2' || ch=='5')) return false;
				break;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c; i++) {
			sb.append(br.readLine());
		}
		
		System.out.println(check(sb.toString()) ? "JAH" : "EI");
		br.close();
	}
}
