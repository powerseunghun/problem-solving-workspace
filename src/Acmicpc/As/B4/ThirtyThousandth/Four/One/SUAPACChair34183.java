package Acmicpc.As.B4.ThirtyThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUAPACChair34183 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int A = Integer.parseInt(str.split(" ")[2]);
		int B = Integer.parseInt(str.split(" ")[3]);
		int v = N*3-M;

		System.out.println(v <= 0 ? 0 : v*A+B);
		br.close();
	}
}
