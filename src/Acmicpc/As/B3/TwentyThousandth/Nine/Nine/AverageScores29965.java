package Acmicpc.As.B3.TwentyThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AverageScores29965 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Long> map = new HashMap<>();
		Map<String, Integer> cntMap = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		String str = null, name = null;
		long v = 0;
		double avg1 = 0, avg2 = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			name = str.split(" ")[0];
			v = Long.parseLong(str.split(" ")[1]);
			map.put(name, map.getOrDefault(name, (long) 0)+v);
			cntMap.put(name, cntMap.getOrDefault(name, 0)+1);
		}
		if (map.containsKey("M") && cntMap.containsKey("M")) {
			avg1 = map.get("M") / (double)cntMap.get("M");
		}
		if (map.containsKey("J") && cntMap.containsKey("J")) {
			avg2 = map.get("J") / (double)cntMap.get("J");
		}
		
		System.out.println(avg1 > avg2 ? "M" : avg1 < avg2 ? "J" : "V");
		br.close();
	}
}
