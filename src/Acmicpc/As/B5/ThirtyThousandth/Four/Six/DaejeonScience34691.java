package Acmicpc.As.B5.ThirtyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DaejeonScience34691 {
	static void mapInit() {
		map.put("animal", "Panthera tigris");
		map.put("tree", "Pinus densiflora");
		map.put("flower", "Forsythia koreana");
	}
	static Map<String, String> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		mapInit();
		while(true) {
			str = br.readLine();
			if (str.equalsIgnoreCase("end")) {
				break;
			}
			sb.append(map.get(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
