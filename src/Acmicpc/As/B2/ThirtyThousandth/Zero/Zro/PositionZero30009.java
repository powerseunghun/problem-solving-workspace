package Acmicpc.As.B2.ThirtyThousandth.Zero.Zro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositionZero30009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int X = Integer.parseInt(str.split(" ")[0]);
		int Y = Integer.parseInt(str.split(" ")[1]);
		int R = Integer.parseInt(str.split(" ")[2]);
		int T = 0, A = 0, B = 0;
		
		while(N-- > 0) {
			T = Integer.parseInt(br.readLine());
			if (Math.abs(X-T) < R) A++;
			if (Math.abs(X-T) == R) B++;
		}
		
		System.out.println(A + " " + B);
		br.close();
	}
}
