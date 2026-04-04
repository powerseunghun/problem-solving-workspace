package Acmicpc.As.B2.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BirthdayStatistics9777 {
	static void mapInit() {
		for (int i = 1; i <= 12; i++) {
			map.put(i, 0);
		}
	}
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = Integer.parseInt(br.readLine()), y = 0;
		mapInit();
		
		while(n-- > 0) {
			str = br.readLine();
			y = Integer.parseInt(str.substring(str.indexOf('/')+1, str.lastIndexOf('/')));
			map.put(y, map.get(y)+1);
		}
		
		for (int i = 1; i <= 12; i++) {
			sb.append(i).append(" ").append(map.get(i)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
