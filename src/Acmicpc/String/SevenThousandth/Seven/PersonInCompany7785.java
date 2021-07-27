package Acmicpc.String.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonInCompany7785 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			switch(tmp.split(" ")[1]) {
			case "enter":
				map.put(tmp.split(" ")[0], 1);
				break;
			case "leave":
				map.remove(tmp.split(" ")[0]);
				break;
			}
		}
		
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			list.add(iter.next().toString());
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
