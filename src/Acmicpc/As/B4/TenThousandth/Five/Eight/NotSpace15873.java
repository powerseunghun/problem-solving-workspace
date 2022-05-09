package Acmicpc.As.B4.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotSpace15873 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = 0, B = 0;
		
		if (str.equals("1010")) {
			A = 10;
			B = 10;
		}
		else if (Integer.parseInt(str) % 10 == 0) {
			A = Integer.parseInt(str) / 100;
			B = 10;
		}
		else {
			A = Integer.parseInt(str) / 10;
			B = Integer.parseInt(str) % 10;
		}
		
		System.out.println(A+B);
		br.close();
	}
}
