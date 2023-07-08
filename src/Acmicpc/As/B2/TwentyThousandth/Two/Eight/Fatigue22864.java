package Acmicpc.As.B2.TwentyThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fatigue22864 {
	static final int d = 24;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int C = Integer.parseInt(str.split(" ")[2]);
		int M = Integer.parseInt(str.split(" ")[3]), f = 0, res = 0;
		
		for (int i = 0; i < d; i++) {
			if (f + A <= M) {
				res += B;
				f += A;
			}
			else {
				f -= C;
				f = f < 0 ? 0 : f;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
