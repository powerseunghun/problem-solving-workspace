package Acmicpc.As.B4.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountingMoney30031 {
	static final int base = 136, w = 6;
	static final int[] money = {1000, 5000, 10000, 50000};
	static Map<Integer, Integer> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0, m = base; i < money.length; i++, m+=w) {
			map.put(m, money[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		mapInit();
		
		while(N-- > 0) {
			res += map.get(Integer.parseInt(br.readLine().split(" ")[0]));
		}
		
		System.out.println(res);
		br.close();
	}
}
