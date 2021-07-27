package Acmicpc.String.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringNumberSum10822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
	}
}
