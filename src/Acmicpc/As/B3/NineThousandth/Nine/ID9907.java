package Acmicpc.As.B3.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ID9907 {
	static int[] weight = {2, 7, 6, 5, 4, 3, 2};
	static Map<Integer, Character> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0; i <= 10; i++) {
			if (i >= 1 && i <= 9) {
				map.put(i, (char)(i+64));
			}
			else map.put(i, i == 0 ? 'J' : 'Z');
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = 0;
		mapInit();
		
		for (int i = 0; i < tmp.length(); i++) {
			sum += (tmp.charAt(i)-'0') * weight[i];
		}
		System.out.println(map.get(sum%11));
		
		br.close();
	}
}
