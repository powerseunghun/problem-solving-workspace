package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathPractice5940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		
		for (int i = A+1; i <= 63; i++) {
			if (String.valueOf(Math.pow(2, i)).charAt(0) == (B+'0')) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}