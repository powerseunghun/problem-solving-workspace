package Acmicpc.As.B4.ThirtyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripleSevens31518 {
	static final int limit = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		boolean flag = true;
		br.readLine();
		
		for (int i = 0; i < limit; i++) {
			str = br.readLine();
			if (!str.contains("7")) {
				flag = false;
			}
		}
		
		System.out.println(flag ? "777" : "0");
		br.close();
	}
}
