package Acmicpc.String.Thousandth.One;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class TwoString1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String s1 = tmp.split(" ")[0];
		String s2 = tmp.split(" ")[1];
		int min = Integer.MAX_VALUE, count = 0;
		
		for (int i = 0; i <= s2.length()-s1.length(); i++) {
			count = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) != s2.charAt(j+i)) count++;
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
	}
}
