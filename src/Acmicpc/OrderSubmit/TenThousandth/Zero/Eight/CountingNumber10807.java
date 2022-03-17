package Acmicpc.OrderSubmit.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountingNumber10807 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			N = Integer.parseInt(st.nextToken());
			if (!map.containsKey(N)) map.put(N, 1);
			else map.put(N, map.get(N)+1);
		}
		v = Integer.parseInt(br.readLine());
		
		System.out.println(map.containsKey(v) ? map.get(v) : 0);
		br.close();
	}
}
