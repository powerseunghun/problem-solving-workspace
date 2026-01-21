package Acmicpc.As.B3.ThirtyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RelayRockScissorPaper35106 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = 0, b = 0;
		
		while(st.hasMoreTokens()) {
			switch(Integer.parseInt(st.nextToken())) {
			case 1:
				a++;
				break;
			case 2:
				b++;
				break;
			}
		}
		
		System.out.println(a < n ? 1 : b < n ? 2 : 3);
		System.out.println(a > n ? 1 : b > n ? 2 : 3);
		br.close();
	}
}
