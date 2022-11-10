package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitCount25841 {
	static int func(int A, int B, int d) {
		int count = 0;
		String tmp = null;
		for (int i = A; i <= B; i++) {
			tmp = i+"";
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == (d+"").charAt(0)) count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int d = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println(func(A, B, d));
		br.close();
	}
}
