package Acmicpc.As.B4.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AttendanceEvent25704 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine()), max = 0;
		
		for (int i = 0, val = 0; i < (N/5 > 4 ? 4 : N/5); i++) {
			if (i % 2 == 0) {
				val = i == 0 ? 500 : 2000;
			}
			else val = i == 1 ? P/10 : P/4;
			max = Math.max(val, max);
		}
		
		System.out.println(P-max < 0 ? 0 : P-max);
		br.close();
	}
}
