package Acmicpc.As.B2.TenThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class STROJOPIS10551 {
	static Map<Character, Integer> map = new HashMap<>();
	static int[] arr = new int[8];
	static void mapInit() {
		map.put('1', 0); map.put('Q', 0); map.put('A', 0); map.put('Z', 0);
		map.put('2', 1); map.put('W', 1); map.put('S', 1); map.put('X', 1);
		map.put('3', 2); map.put('E', 2); map.put('D', 2); map.put('C', 2);
		map.put('4', 3); map.put('R', 3); map.put('F', 3); map.put('V', 3); map.put('5', 3); map.put('T', 3); map.put('G', 3); map.put('B', 3);
		map.put('6', 4); map.put('Y', 4); map.put('H', 4); map.put('N', 4); map.put('7', 4); map.put('U', 4); map.put('J', 4); map.put('M', 4);
		map.put('8', 5); map.put('I', 5); map.put('K', 5); map.put(',', 5);
		map.put('9', 6); map.put('O', 6); map.put('L', 6); map.put('.', 6);
		map.put('0', 7); map.put('-', 7); map.put('=', 7); map.put('P', 7); map.put('[', 7); map.put(']', 7); map.put(';', 7); map.put('\'', 7); map.put('/', 7);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			arr[map.get(str.charAt(i))]++;
		}
		for (int el : arr) {
			sb.append(el).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
