package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Шахматнаядоска27239 {
	static final int h = 8;
	static Map<Integer, String> map = new HashMap<>();
	static void mapInit() {
		char c = 'a';
		for (int i = 1, v = 1; i <= h; i++, c = 'a') {
			for (int j = 1; j <= h; j++, v++) {
				map.put(v, c+""+i);
				c++;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		mapInit();
		
		System.out.println(map.get(N));
		br.close();
	}
}
