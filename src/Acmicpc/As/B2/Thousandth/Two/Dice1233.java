package Acmicpc.As.B2.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Dice1233 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int s1 = Integer.parseInt(tmp.split(" ")[0]);
		int s2 = Integer.parseInt(tmp.split(" ")[1]);
		int s3 = Integer.parseInt(tmp.split(" ")[2]);
		int max = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
		
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1, sum = 0; k <= s3; k++) {
					sum = i+j+k;
					map.put(sum, map.getOrDefault(sum, 0)+1);
				}
			}
		}
		System.out.println(map);
		for (Integer i : map.values()) {
			max = Math.max(i, max);
		}
		
		for (Integer i : map.keySet()) {
			System.out.println("i : " + i + " , get i : " + map.get(i));
			if (map.get(i) == max && i < res) {
				res = i;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
