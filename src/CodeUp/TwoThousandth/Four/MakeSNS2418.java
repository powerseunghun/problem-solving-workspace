package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MakeSNS2418 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 0;
		String[] strs = null;
		List<String> list = new ArrayList<>();
		Set<String> tmp = new HashSet<>();
		Map<String, String> gender = new HashMap<>();
		int[] count = null;
		String baseGender = "";
		
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
			tmp.add(list.get(i).split(",")[0]);
			gender.put(list.get(i).split(",")[0], list.get(i).split(",")[1]);
			
		}
		List<String> names = new ArrayList<>(tmp);
		Collections.sort(names);
		count = new int[names.size()];
		
		for (int i = 0; i < list.size(); i++) {
			strs = list.get(i).split(",");
			baseGender = strs[1];
			for (int j = 3; j < strs.length; j++) {
				for (int a = 0; a < names.size(); a++) {
					if (names.get(a).equals(strs[j])) {
						if (!gender.get(strs[j]).equals(baseGender)) {
							count[a]++;
						}
					}
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= max) max = count[i];
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) System.out.println(names.get(i));
		}
	}
}
