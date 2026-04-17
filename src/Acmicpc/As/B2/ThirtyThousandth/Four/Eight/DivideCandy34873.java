package Acmicpc.As.B2.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DivideCandy34873 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			map.put(v, map.getOrDefault(v, 0)+1);
		}
		
		for (Integer k : map.values()) {
			if (k > 2) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? "Yes" : "No");
		br.close();
	}
}
