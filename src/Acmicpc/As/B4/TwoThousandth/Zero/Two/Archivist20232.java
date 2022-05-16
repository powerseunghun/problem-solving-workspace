package Acmicpc.As.B4.TwoThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Archivist20232 {
	static String[] strs = {"ITMO", "SpbSU", "SpbSU", "ITMO", "ITMO", "SpbSU", "ITMO", "ITMO", "ITMO", "ITMO", "ITMO",  "PetrSU, ITMO", 
			"SPbSU", "SpbSU", "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO" };
	static Map<Integer, String> map = new HashMap<>();
	static void mapInit() {
		for (int i = 1995; i <= 2019; i++) {
			map.put(i, strs[i-1995]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		mapInit();
		
		System.out.println(map.get(y));
		br.close();
	}
}
