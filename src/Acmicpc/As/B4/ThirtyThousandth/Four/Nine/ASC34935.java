package Acmicpc.As.B4.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASC34935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long t = Long.parseLong(st.nextToken()), v = 0;
		boolean flag = true;
		
		while(st.hasMoreTokens()) {
			v = Long.parseLong(st.nextToken());
			if (t >= v) {
				flag = false;
				break;
			}
			t = v;
		}
		
		System.out.println(flag ? 1 : 0);
		br.close();
	}
}
