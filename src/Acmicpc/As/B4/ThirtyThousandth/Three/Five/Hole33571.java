package Acmicpc.As.B4.ThirtyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hole33571 {
	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static void mapInit() {
		map.put('A', 1); map.put('B', 2); map.put('C', 0); map.put('D', 1);
		map.put('E', 0); map.put('F', 0); map.put('G', 0); map.put('H', 0);
		map.put('I', 0); map.put('J', 0); map.put('K', 0); map.put('L', 0);
		map.put('M', 0); map.put('N', 0); map.put('O', 1); map.put('P', 1);
		map.put('Q', 1); map.put('R', 1); map.put('S', 0); map.put('T', 0);
		map.put('U', 0); map.put('V', 0); map.put('W', 0); map.put('X', 0);
		map.put('Y', 0); map.put('Z', 0); map.put('a', 1); map.put('b', 1);
		map.put('c', 0); map.put('d', 1); map.put('e', 1); map.put('f', 0);
		map.put('g', 1); map.put('h', 0); map.put('i', 0); map.put('j', 0);
		map.put('k', 0); map.put('l', 0); map.put('m', 0); map.put('n', 0);
		map.put('o', 1); map.put('p', 1); map.put('q', 1); map.put('r', 0);
		map.put('s', 0); map.put('t', 0); map.put('u', 0); map.put('v', 0);
		map.put('w', 0); map.put('x', 0); map.put('y', 0); map.put('z', 0);
		map.put(' ', 0); map.put('@', 1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			sum += map.get(str.charAt(i));
		}
		
		System.out.println(sum);
		br.close();
	}
}
