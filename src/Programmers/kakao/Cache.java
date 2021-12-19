package Programmers.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
	static List<String> cache = new ArrayList<>();
	static Map<String, Integer> check = new HashMap<>();
	static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String city = null;
        if (cacheSize == 0) return cities.length * 5;
        
        for (int i = 0; i < cities.length; i++) {
        	city = cities[i].toUpperCase();
        	if (cache.isEmpty()) {
        		cache.add(city);
        		check.put(city, i);
        		answer += 5;
        	}
        	else {
        		if (cache.contains(city)) {
        			check.put(city, i);
        			answer += 1;
        		}
        		else {
        			if (cache.size() < cacheSize) {
        				cache.add(city);
        				check.put(city, i);
        				answer += 5;
        			}
        			else if (cache.size() == cacheSize){
        				int min = Integer.MAX_VALUE;
        				for (int j = 0; j < cache.size(); j++) {
        					min = Math.min(check.get(cache.get(j)), min);
        				}
        				for (int j = 0; j < cache.size(); j++) {
        					if (check.get(cache.get(j)) == min) {
        						check.remove(cache.get(j));
        						cache.remove(j);
        						break;
        					}
        				}
        				cache.add(city);
        				check.put(city, i);
        				answer += 5;
        			}
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int cacheSize = 0;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		System.out.println(solution(cacheSize, cities));
	}
}
