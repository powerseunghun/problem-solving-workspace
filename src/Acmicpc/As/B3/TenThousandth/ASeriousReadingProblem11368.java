package Acmicpc.As.B3.TenThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASeriousReadingProblem11368 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = 0, W = 0, L = 0, P = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			C = Integer.parseInt(tmp.split(" ")[0]);
			W = Integer.parseInt(tmp.split(" ")[1]);
			L = Integer.parseInt(tmp.split(" ")[2]);
			P = Integer.parseInt(tmp.split(" ")[3]);
			if (C == 0 && W == 0 && L == 0 && P == 0) break;
			
			sb.append((int)(Math.pow(Math.pow((Math.pow(C, W)), L), P)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
