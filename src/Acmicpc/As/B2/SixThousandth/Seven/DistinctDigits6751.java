package Acmicpc.As.B2.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DistinctDigits6751 {
	static int func(int i, Map<Integer, Integer> map) {
		while (i != 0) {
			map.put(i%10, map.getOrDefault(i%10, 0)+1);
			i /= 10;
		}
		return map.keySet().size();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = N+1; ; i++) {
			map.clear();
			if (String.valueOf(i).length() == func(i, map)) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
