package Acmicpc.String.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctaNumber2998 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine(), s = "";
		StringBuilder sb = new StringBuilder();
		int needDigit = 0, count = 0, sum = 0;
		
		while ((tmp.length() + needDigit++) % 3 != 0) {
			s += "0";
		}
		s += tmp;
		
		for (int i = s.length()-1, val = 0; i >= 0; i--) {
			val = s.charAt(i) - '0';
			sum += count == 0 ? val : val * Math.pow(2, count);
			count++;
			
			if (count == 3) {
				sb.append(sum);
				sum = 0;
				count = 0;
			}
		}
		System.out.println(sb.reverse().toString());
	}
}
