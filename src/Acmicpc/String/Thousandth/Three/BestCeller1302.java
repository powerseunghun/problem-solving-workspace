package Acmicpc.String.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BestCeller1302 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		Map<String, Integer> map = new HashMap<>();
		ArrayList<String> nameList = new ArrayList<>();
		int N = Integer.parseInt(br.readLine()), max = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			if (!map.containsKey(tmp)) {
				map.put(tmp, 1);
			}
			else map.put(tmp, (int)(map.get(tmp))+1);
		}
		
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			max = Math.max(max, (int)map.get(iter.next().toString()));
		}
		
		iter = map.keySet().iterator();
		while (iter.hasNext()) {
			tmp = iter.next().toString();
			if ((int)map.get(tmp) == max) {
				nameList.add(tmp);
			}
		}
		Collections.sort(nameList);
		
		System.out.println(nameList.get(0));
 	}
}
