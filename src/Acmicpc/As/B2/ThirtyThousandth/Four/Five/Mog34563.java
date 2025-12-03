package Acmicpc.As.B2.ThirtyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mog34563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(Integer.parseInt(str.split(" ")[0]) + Integer.parseInt(str.split(" ")[1])-1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
