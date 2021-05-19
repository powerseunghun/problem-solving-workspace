package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MakeSNS2417 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 0;
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			list.add(tmp.split(",")[0]);
			for (int j = 3; j < tmp.split(",").length; j++) {
				if (!map.containsKey(tmp.split(",")[j])) {
					map.put(tmp.split(",")[j], 1);
				}
				else map.put(tmp.split(",")[j], map.get(tmp.split(",")[j])+1);
			}
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i)) && map.get(list.get(i)) >= max) {
				max = map.get(list.get(i));
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i)) && max == map.get(list.get(i))) {
				System.out.println(list.get(i));
			}
		}
	}
}
