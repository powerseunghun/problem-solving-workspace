package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class IWannaBeTheGuy {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), val = 0;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				map.put(val, map.getOrDefault(val, 0)+1);
			}
		}
		for (int i = 1; i <= N; i++) {
			if (!map.containsKey(i)) {
				System.out.println("Oh, my keyboard!\n");
				return;
			}
		}
		
		System.out.println("I become the guy.\n");
		br.close();
	}
}
