package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotRepeatNumber {
	static Map<Integer, Integer> map = new HashMap<>();
	static boolean check(int N) {
		map.clear();
		int val = 0;
		while (N != 0) {
			val = N % 10;
			if (map.containsKey(val)) return false;
			map.put(val, 1);
			N /= 10;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), val = 1;
		List<Integer> list = new ArrayList<>();
		
		while (list.size() < n) {
			if (check(val)) list.add(val);
			val++;
		}
		System.out.println(list.get(n-1));
	}
}
