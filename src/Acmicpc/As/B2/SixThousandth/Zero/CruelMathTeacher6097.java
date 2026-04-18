package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CruelMathTeacher6097 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int P = Integer.parseInt(str.split(" ")[1]);
		long res = (long)Math.pow(N, P);
		
		
		System.out.println(res);
		br.close();
	}
}
