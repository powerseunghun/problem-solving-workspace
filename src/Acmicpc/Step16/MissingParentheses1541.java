package Acmicpc.Step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingParentheses1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int sum = 0;
		String[] includePlus = str.split("-");
		
		for (int i = 0; i < includePlus.length; i++) {
			if (includePlus[i].contains("+")) {
				st = new StringTokenizer(includePlus[i], "+");
				sum = 0;
				while(st.hasMoreTokens()) {
					sum += Integer.parseInt(st.nextToken());
					includePlus[i] = sum + "";
				}
			}
		}
		sum = Integer.parseInt(includePlus[0]);
		for (int i = 1; i < includePlus.length; i++) {
			sum -= Integer.parseInt(includePlus[i]);
		}
		
		System.out.println(sum);
	}
}
