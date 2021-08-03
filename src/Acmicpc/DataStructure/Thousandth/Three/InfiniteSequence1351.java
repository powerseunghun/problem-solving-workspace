package Acmicpc.DataStructure.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class InfiniteSequence1351 {
	static Map<Long, Long> map = new HashMap<>();
	static long getValue(long n, long P, long Q) {
		if (n == 0) return 1;
		if (map.containsKey(n)) return map.get(n);
		
		map.put(n, getValue(n/P, P, Q) + getValue(n/Q, P, Q));
		return map.get(n);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long N = Long.parseLong(tmp.split(" ")[0]);
		long P = Long.parseLong(tmp.split(" ")[1]);
		long Q = Long.parseLong(tmp.split(" ")[2]);
		
		System.out.println(getValue(N, P, Q));
	}
}
