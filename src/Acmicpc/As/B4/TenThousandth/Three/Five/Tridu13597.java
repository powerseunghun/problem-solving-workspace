package Acmicpc.As.B4.TenThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tridu13597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		while (st.hasMoreTokens()) {
			res = Math.max(res, Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(res);
		br.close();
	}
}
