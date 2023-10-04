package Acmicpc.As.B1.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Marathoner9339 {
	static Map<Integer, Integer> order = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), K = 0, N = 0;
		int h = 0, m = 0, min = 0, res = 0, aut = 0;
		StringTokenizer st = null;
		String str = null;
		
		while(T-- > 0) {
			K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			order = new HashMap<>();
			
			for (int i = 1; i <= K; i++) {
				order.put(Integer.parseInt(st.nextToken()), i);
			}
			
			N = Integer.parseInt(br.readLine());
			min = Integer.MAX_VALUE;
			
			aut = 0;
			for (int i = 1, b = 0, t = 0; i <= N; i++) {
				str = br.readLine();
				b = Integer.parseInt(str.split(" ")[0]);
				h = Integer.parseInt(str.split(" ")[1]);
				m = Integer.parseInt(str.split(" ")[2]);
				if (h == -1 && m == -1) continue;
				t = (h*60) + m;
				if (t > 360 || !order.keySet().contains(b)) continue;
				
				aut++;
				if (min == Integer.MAX_VALUE) {
					min = t;
					res = b;
				}
				else {
					if (t < min) {
						min = t;
						res = b;
					}
					else if (t == min && order.get(b) < order.get(res)) {
						min = t;
						res = b;
					}
				}
			}
			sb.append(res).append(" ").append(aut).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
