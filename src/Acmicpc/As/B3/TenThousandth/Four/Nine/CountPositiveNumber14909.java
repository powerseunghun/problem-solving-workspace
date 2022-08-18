package Acmicpc.As.B3.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountPositiveNumber14909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		while (st.hasMoreTokens()) {
			if (Integer.parseInt(st.nextToken()) > 0) cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
