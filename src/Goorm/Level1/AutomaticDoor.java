package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AutomaticDoor {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		double L = 0, a = 0, v = 0, t = 0;
		StringTokenizer  st = null;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			L = Double.parseDouble(st.nextToken());
			a = Double.parseDouble(st.nextToken());
			v = Double.parseDouble(st.nextToken());
			t = Math.sqrt(L*2 / a);
			sb.append(String.format("%.2f", t*v) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
