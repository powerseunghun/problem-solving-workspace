package Acmicpc.As.B4.TwentyThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InterceptingInformation26209 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag = true;
		int val = 0;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (!(val == 0 || val == 1)) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? "S" : "F");
		br.close();
	}
}
