package Acmicpc.As.B1.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class CoinGame2684 {
	static Map<String, Integer> map = new HashMap<>();
	static String[] cases = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
	static void mapInit() {
		map.clear();
		for (String s : cases) {
			map.put(s, 0);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int P = Integer.parseInt(br.readLine());
		String str = null, subStr = null;
		
		while(P-- > 0) {
			str = br.readLine();
			mapInit();
			for (int i = 0; i < str.length()-2; i++) {
				subStr = str.substring(i, i+3);
				map.put(subStr, map.get(subStr)+1);
			}
			
			for (String s : cases) {
				sb.append(map.get(s)).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
