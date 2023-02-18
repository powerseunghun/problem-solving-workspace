package Acmicpc.As.B2.FourThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Prerequisites4285 {
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int m = 0, c = 0, res = 0, sum = 0;
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("0")) break;
			m = Integer.parseInt(tmp.split(" ")[1]);
			set.clear();
			
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				set.add(st.nextToken());
			}
			
			sum = 0;
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				c = Integer.parseInt(st.nextToken());
				
				res = 0;
				while (st.hasMoreTokens()) {
					if (set.contains(st.nextToken())) {
						res++;
					}
				}
				if (res >= c) sum++;
			}
			sb.append(sum >= m ? "yes" : "no").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
