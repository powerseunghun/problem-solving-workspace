package Acmicpc.As.B4.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SchoolFood31821 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = 0, v = 0, res = 0;
		
		for (int i = 1; i <= N; i++) {
			v = Integer.parseInt(br.readLine());
			map.put(i, v);
		}
		M = Integer.parseInt(br.readLine());
		
		while(M-- > 0) {
			v = Integer.parseInt(br.readLine());
			res += map.get(v);
		}
		
		System.out.println(res);
		br.close();
	}
}
