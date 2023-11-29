package Acmicpc.As.S5.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DataStructure23253 {
	static final int limit = 200000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), v = limit+1, w = 0;
		boolean flag = true;
		
		for (int i = 0; i < M; i++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			
			v = limit+1;
			while (st.hasMoreTokens() & flag) {
				w = Integer.parseInt(st.nextToken());
				if (w > v) flag = false;
				v = w;
			}
		}
		
		System.out.println(flag ? "Yes" : "No");
		br.close();
	}
}
