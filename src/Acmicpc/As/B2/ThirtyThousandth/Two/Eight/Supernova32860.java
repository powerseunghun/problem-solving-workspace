package Acmicpc.As.B2.ThirtyThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Supernova32860 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		
		sb.append("SN " + N);
		sb.append(M <= 26 ? (char)('A'+M-1) : (char)('a'+(M-1)/26-1));
		if (M > 26) {
			sb.append((char)('a'+(M-1)%26));
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
