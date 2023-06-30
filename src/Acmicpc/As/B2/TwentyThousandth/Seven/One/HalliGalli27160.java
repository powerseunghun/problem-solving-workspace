package Acmicpc.As.B2.TwentyThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HalliGalli27160 {
	static final int target = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), v = 0;
		String str = null, f = null;
		Map<String, Integer> map = new HashMap<>();
		boolean flag = false;
		
		while(T-- > 0) {
			str = br.readLine();
			f = str.split(" ")[0];
			v = Integer.parseInt(str.split(" ")[1]);
			map.put(f, map.getOrDefault(f, 0)+v);
		}
		for (String s : map.keySet()) {
			if (map.get(s) == target) {
				flag = true;
				break;
			}
		}
		
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
