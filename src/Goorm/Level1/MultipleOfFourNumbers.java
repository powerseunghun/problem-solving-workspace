package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleOfFourNumbers {
	static int getMultiple(int a, int b) {
		return a * b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 1;
		
		while (st.hasMoreTokens()) {
			res = getMultiple(res, Integer.parseInt(st.nextToken()));
		}
		System.out.println(res);
	}
}
