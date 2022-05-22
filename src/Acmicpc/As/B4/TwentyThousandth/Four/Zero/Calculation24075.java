package Acmicpc.As.B4.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation24075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(Math.max(A+B, A-B));
		System.out.println(Math.min(A+B, A-B));
		br.close();
	}
}
