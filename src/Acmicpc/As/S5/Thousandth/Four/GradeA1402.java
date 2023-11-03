package Acmicpc.As.S5.Thousandth.Four;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GradeA1402 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			sb.append("yes").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
