package cf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Garland {
	static int check(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int res = 0, idx = 0;
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		if (map.keySet().size() == 1) res = 1;
		else if (map.keySet().size() == 2) {
			int[] tArr = new int[map.keySet().size()];
			for (Integer i : map.values()) {
				tArr[idx++] = i;
			}
			res = tArr[0] == tArr[1] ? 3 : 2;
		}
		else res = 4;
		
		return res;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), v = 0;
		
		while(N-- > 0) {
			v = check(br.readLine());
			switch(v) {
			case 1:
				sb.append(-1);
				break;
			case 2:
				sb.append(6);
				break;
			default:
				sb.append(4);
				break;
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
