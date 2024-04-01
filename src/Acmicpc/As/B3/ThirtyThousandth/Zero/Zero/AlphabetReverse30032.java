package Acmicpc.As.B3.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AlphabetReverse30032 {
	static HashMap<Integer, HashMap<Character, Character>> map = new HashMap<Integer, HashMap<Character, Character>>();
	static void mapInit() {
		HashMap<Character, Character> tempMap1 = new HashMap<Character, Character>();
		HashMap<Character, Character> tempMap2 = new HashMap<Character, Character>();
		tempMap1.put('d', 'q');
		tempMap1.put('b', 'p');
		tempMap1.put('q', 'd');
		tempMap1.put('p', 'b');
		map.put(1, tempMap1);
		tempMap2.put('d', 'b');
		tempMap2.put('b', 'd');
		tempMap2.put('q', 'p');
		tempMap2.put('p', 'q');
		map.put(2, tempMap2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int D = Integer.parseInt(str.split(" ")[1]);
		mapInit();
		
		while(N-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				sb.append(map.get(D).get(str.charAt(i)));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
