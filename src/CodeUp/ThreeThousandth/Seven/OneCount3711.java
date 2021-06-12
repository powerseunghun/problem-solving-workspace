package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OneCount3711 {
	public static void main(String[] args) throws IOException {
		Map<Integer, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(tmp.split(" ")[2]);
		int res = 0;
		
		for (int i = 0; i < 10; i++) {
			if (!map.containsKey(i)) {
				if (i == k) map.put(i, 1);
				else map.put(i, 0);
			}
		}
		
		for (int i = 1; i <= b; i++) {
			if(!map.containsKey(i)) {
				map.put(i, map.get(i/10) + (i % 10 == k ? 1 : 0));
			}
			if (i >= a && i <= b) {
				res += map.get(i);
			}
 		}
		System.out.println(res);
	}
}
