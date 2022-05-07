package Acmicpc.As.B4.TwoThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave14470 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		int res = 0;
		boolean flag = A < 0;
		
		if (flag) {
			for (int i = A; i < 0; i++) {
				res += C;
			}
			res += D;
			for (int i = 0; i < B; i++) {
				res += E;
			}
		}
		else {
			for (int i = A; i < B; i++) {
				res += E;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
