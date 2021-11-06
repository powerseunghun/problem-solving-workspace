package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Wash {
	static Map<String, ArrayList<Integer>> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String[] colors = br.readLine().split(" ");
		ArrayList<Integer> tList = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			int time = Integer.parseInt(tmp.split(" ")[0]);
			String color = tmp.split(" ")[1];
			
			tList = map.containsKey(color) ? map.get(color) : new ArrayList<>();
			tList.add(time);
			map.put(color, tList);
		}
		
		for (int i = 0; i < colors.length; i++) {
			if (!map.containsKey(colors[i])) continue;
			tList = map.get(colors[i]);
			Collections.sort(tList);
			
			for (int j = tList.size()-1; j >= 0; j-=2) {
				if (j == 0) {
					sum += tList.get(j);
				}
				else sum += Math.max(tList.get(j), tList.get(j-1));
			}
		}
		System.out.println(sum);
		br.close();
	}
}
