package Acmicpc.String.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbnormalMultiple1225 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String s1 = tmp.split(" ")[0], s2 = tmp.split(" ")[1];
		long sum = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				sum += ((s1.charAt(i)-'0') * (s2.charAt(j)-'0'));
			}
		}
		
		System.out.println(sum);
	}
}
