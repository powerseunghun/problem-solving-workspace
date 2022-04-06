package Acmicpc.OrderSubmit.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Happiness15969 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, val = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			max = Math.max(max, val);
			min = Math.min(min, val);
		}
		
		System.out.println(max-min);
		br.close();
	}
}
