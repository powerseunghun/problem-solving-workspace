package Acmicpc.String.TenThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctaDecHexa11816 {
	static int change(String str, String ns) {
		int sum = 0;
		for (int i = str.length()-1, val = 0; i >= 0; i--) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') val = (str.charAt(i) - 87);
			else val = str.charAt(i) - '0'; 
			
			if (i == str.length()-1) sum += val;
			else sum += (val * Math.pow(Integer.parseInt(ns), str.length()-1-i));
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		
		if (x.charAt(0) == '0' && x.charAt(1) == 'x') {
			System.out.println(change(x.substring(2, x.length()), "16"));
		}
		else if (x.charAt(0) == '0') {
			System.out.println(change(x, "8"));
		}
		else System.out.println(x);
	}
}
