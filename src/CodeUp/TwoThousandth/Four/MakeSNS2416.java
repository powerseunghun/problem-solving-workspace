package CodeUp.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MakeSNS2416 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, String> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), mCount = 0, fmCount = 0;
		ArrayList<String> list = new ArrayList<>();
		String findName = null, tmp = null;
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			if (!map.containsKey(tmp.split(",")[0])) {
				map.put(tmp.split(",")[0], tmp.split(",")[1]);
			}
			list.add(tmp);
		}
		findName = br.readLine();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).split(",")[0].equals(findName)) {
				findName = list.get(i);
				break;
			}
		}
		
		for (int i = 3; i < findName.split(",").length; i++) {
			String gender = null;
			if (map.containsKey(findName.split(",")[i])) {
				gender = map.get(findName.split(",")[i]);
				if (gender.equals("F")) fmCount++;
				else mCount++;
			}
		}
		
		System.out.println(mCount);
		System.out.println(fmCount);
	}
}
