package Acmicpc.As.S5.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DecisionDisabled14646 {
	static final int limit = 100000;
	static boolean[] arr = new boolean[limit+1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, s = 0, res = Integer.MIN_VALUE;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (!arr[v]) {
				arr[v] = true;
				s++;
			}
			else s--;
			res = Math.max(res, s);
		}
		
		System.out.println(res);
		br.close();
	}
}
