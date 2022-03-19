package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cycle2526 {
	static int res = 0;
	static Map<Integer, Integer> map = new HashMap<>();
	static void init(int N) {
		map.put(N, 1);
	}
	static void func(int N, int P) {
		int idx = 2, val = N;
		
		while (true) {
			val = (val * N) % P;
			if (!map.containsKey(val)) map.put(val, idx++);
			else {
				res = (idx - map.get(val));
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int P = Integer.parseInt(tmp.split(" ")[1]);
		
		init(N);
		func(N, P);
		
		System.out.println(res);
		br.close();
	}
}
