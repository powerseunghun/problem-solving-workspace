package Acmicpc.As.B2.EightThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stoi8246 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		int K = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println((A/K)*(B/K)-Math.max(A/K-2, 0)*Math.max(B/K-2, 0));
		br.close();
	}
}
