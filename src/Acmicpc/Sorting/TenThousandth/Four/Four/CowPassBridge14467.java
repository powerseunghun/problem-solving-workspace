package Acmicpc.Sorting.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CowPassBridge14467 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine()), count = 0;
		String tmp = null;
		
		for (int i = 0, cow = 0, bridge = 0; i < N; i++) {
			tmp = br.readLine();
			cow = Integer.parseInt(tmp.split(" ")[0]);
			bridge = Integer.parseInt(tmp.split(" ")[1]);
			if (!map.containsKey(cow)) map.put(cow, bridge);
			else {
				if (map.get(cow) != bridge) {
					count++;
					map.put(cow, bridge);
				}
			}
		}
		System.out.println(count);
	}
}
