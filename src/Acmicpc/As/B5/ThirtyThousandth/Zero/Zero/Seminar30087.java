package Acmicpc.As.B5.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Seminar30087 {
	static Map<String, String> map = new HashMap<>();
	static void mapInit() {
		map.put("Algorithm", "204");
		map.put("DataAnalysis", "207");
		map.put("ArtificialIntelligence", "302");
		map.put("CyberSecurity", "B101");
		map.put("Network", "303");
		map.put("Startup", "501");
		map.put("TestStrategy", "105");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		mapInit();
		
		while(N-- > 0) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
