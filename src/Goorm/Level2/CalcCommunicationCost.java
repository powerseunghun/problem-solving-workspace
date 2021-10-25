package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CalcCommunicationCost {
	static Map<Integer, Integer> map = new HashMap<>();
	static int[] datas = {300, 1000, 2000, 6000, 11000, Integer.MAX_VALUE};
	static int[] costs = {29900, 34900, 39900, 49900, 59900, 69900};
	static void mapInit() {
		for (int i = 0; i < datas.length; i++) {
			map.put(datas[i], costs[i]);
			map.put(costs[i], datas[i]);
		}
	}
	static int getRecommendCost(int useData) {
		int idx = Integer.MIN_VALUE;
		for (int i = 0; i < datas.length; i++) {
			if (useData <= datas[i]) {
				idx = i;
				break;
			}
		}
		return idx == Integer.MAX_VALUE ? 
				map.get(datas[datas.length-1]) : map.get(datas[idx]);
	}
	static int getCost(int curCost, int useData) {
		if (curCost == 69900) return curCost;
		if (map.get(curCost) >= useData) return curCost;
		
		int overData = useData - map.get(curCost);
		int limit = overData < 5000 ? 25000 : 180000;
		int overCost = overData * 20;
		
		return curCost + Math.min(overCost, limit);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		mapInit();
		int curCost = Integer.parseInt(tmp.split(" ")[0]);
		int useData = Integer.parseInt(tmp.split(" ")[1]);
		int recommendCost = getRecommendCost(useData);
		int nowCost = getCost(curCost, useData);
		int newCost = getCost(recommendCost, useData);
		
		if (nowCost < newCost) {
			recommendCost = curCost;
			newCost = getCost(recommendCost, useData);
		}

		System.out.println(recommendCost + " " + nowCost + " " + newCost);
	}
}
