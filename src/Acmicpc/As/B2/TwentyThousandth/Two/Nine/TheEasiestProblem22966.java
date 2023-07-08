package Acmicpc.As.B2.TwentyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TheEasiestProblem22966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		String tmp = null, res = null;
		int N = Integer.parseInt(br.readLine()), v = 0, min = Integer.MAX_VALUE;
		
		while(N-- > 0) {
			tmp = br.readLine();
			v = Integer.parseInt(tmp.split(" ")[1]);
			tmp = tmp.split(" ")[0];
			map.put(tmp, v);
		}
		
		for (String kStr : map.keySet()) {
			v = map.get(kStr);
			if (v < min) {
				min = v;
				res = kStr;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
