package Acmicpc.As.B3.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoBrainer4562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), x = 0, y = 0;
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			sb.append(x < y ? "NO BRAINS\n" : "MMM BRAINS\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
