package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CollatzConjecture {
	static Map<Integer, Integer> mem = new HashMap<>();
	static int getCycle(int n) {
		int cycle = 1;
		while (n != 1) {
			if (mem.containsKey(n)) {
				return cycle+mem.get(n)-1;
			}
			cycle++;
			if (n % 2 == 0) {
				n /= 2;
			}
			else {
				n *= 3;
				n+=1;
			}
		}
		return cycle;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE;
		
		for (int i = a, val = 0; i <= b; i++) {
			val = getCycle(i);
			if (!mem.containsKey(i)) mem.put(i, val);
			max = Math.max(max, val);
		}
		System.out.println(max);
	}
}
