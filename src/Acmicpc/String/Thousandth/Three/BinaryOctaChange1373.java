package Acmicpc.String.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryOctaChange1373 {
	static int getBinary(String s) {
		int sum = 0;
		for (int i = 0, val = 0; i < s.length(); i++) {
			val = s.charAt(i) - '0';
			if (i == 0) {
				sum += val;
			}
			else sum += val * Math.pow(2, i);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(), tmp = "";
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			tmp += s.charAt(i);
			count++;
			if (count == 3 || i == 0) {
				sb.append(getBinary(tmp));
				tmp = "";
				count = 0;
			}
		}
		System.out.println(sb.reverse().toString());
	}
}
