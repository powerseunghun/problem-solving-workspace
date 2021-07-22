package Acmicpc.MatheMatics.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copyright2914 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int I = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(A * (I-1) + 1);
	}
}
