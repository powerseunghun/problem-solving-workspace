package Acmicpc.As.B3.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TimeLimits16427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE;
		while (st.hasMoreTokens()) {
			max = Math.max(max, Integer.parseInt(st.nextToken()));
		}
		s *= max;
		
		System.out.println((int)(Math.ceil(s / 1000.0)));
		br.close();
	}
}
