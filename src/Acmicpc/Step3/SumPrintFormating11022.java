package Acmicpc.Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumPrintFormating11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0;
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			
			sb.append("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}
		System.out.println(sb);
	}
}
