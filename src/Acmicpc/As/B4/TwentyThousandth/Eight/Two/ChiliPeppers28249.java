package Acmicpc.As.B4.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChiliPeppers28249 {
	static String[] cs = {"Poblano","Mirasol","Serrano","Cayenne","Thai","Habanero"};
	static int[] scv = {1500,6000,15500,40000,75000,125000};
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0; i < Math.min(cs.length, scv.length); i++) {
			map.put(cs[i], scv[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		String str = null;
		mapInit();
		while(N-- > 0) {
			str = br.readLine();
			res += map.get(str);
		}
		
		System.out.println(res);
		br.close();
	}
}
