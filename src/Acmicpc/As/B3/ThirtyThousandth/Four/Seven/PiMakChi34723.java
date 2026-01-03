package Acmicpc.As.B3.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiMakChi34723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int P = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		int X = Integer.parseInt(br.readLine()), res = Integer.MAX_VALUE;
		
		for (int i = 1; i <= P; i++) {
			for (int j = 1; j <= M; j++) {
				for (int k = 1; k <= C; k++) {
					res = Math.min(Math.abs((i+j)*(j+k)-X), res);
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
