package Acmicpc.As.B4.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.StringTokenizer;

public class CalcAge16199 {
	static int[] age1 = new int[3];
	static int[] age2 = new int[3];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int calcAge = 0;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				if (i == 0) age1[j] = Integer.parseInt(st.nextToken());
				else age2[j] = Integer.parseInt(st.nextToken());
			}
		}
		calcAge = age2[0] - age1[0];
		
		// if (age1[0] == age2[0]) 
	}
}
