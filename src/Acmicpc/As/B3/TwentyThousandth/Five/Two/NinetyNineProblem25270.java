package Acmicpc.As.B3.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NinetyNineProblem25270 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), w = 1, res = 0;
		boolean flag = false;
		
		if (N >= 1 && N < 99) {
			res = 99;
			flag = true;
		}
		
		if (!flag) {
			while (true) {
				if ((N + w) % 100 == 99) {
					res = N+w;
					break;
				}
				if ((N - w) % 100 == 99) {
					res = N-w;
					break;
				}
				w++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
