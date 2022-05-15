package Acmicpc.As.B4.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam18411 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int val = 0, sum = 0, min = Integer.MAX_VALUE;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			sum += val;
			min = Math.min(min, val);
		}
		
		System.out.println(sum-min);
		br.close();
	}
}
