package Acmicpc.As.B3.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Handebol13617 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), cnt = 0, total = 0;
		
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			cnt = 0;
			while (st.hasMoreTokens()) {
				if (Integer.parseInt(st.nextToken()) <= 0) break;
				cnt++;
			}
			if (cnt == M) total++;
		}
		
		System.out.println(total);
		br.close();
	}
}
