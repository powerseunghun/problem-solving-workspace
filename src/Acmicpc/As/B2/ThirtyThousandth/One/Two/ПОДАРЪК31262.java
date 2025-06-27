package Acmicpc.As.B2.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ПОДАРЪК31262 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		char[] c = br.readLine().toCharArray();
		Arrays.sort(c);
		
		sb.append(c[3]);
		sb.append(c[2]);
		sb.append(c[4]);
		sb.append(c[1]);
		sb.append(c[5]);
		sb.append(c[0]);
		System.out.println(sb.toString());
		br.close();
	}
}
