package Programmers.level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BestAlbum {
	static Set<String> set = new HashSet<>();
	static ArrayList<String> genresDupEl = new ArrayList<>();
	static Map<String, Integer> map = new HashMap<>();
	static Map<String, ArrayList<Integer>> map2 = new HashMap<>();
	static Map<Integer, String> playCount = new HashMap<>();
	static void calcPlay(String[] genres, int[] plays) {
		for (int i = 0; i < genres.length; i++) {
			// total count
			if (!map.containsKey(genres[i])) {
				map.put(genres[i], plays[i]);
			}
			else map.put(genres[i], map.get(genres[i])+plays[i]);
			
			// genres play
			ArrayList<Integer> tmp = !map2.containsKey(genres[i]) ? new ArrayList<>() : map2.get(genres[i]);
			tmp.add(plays[i]);
			map2.put(genres[i], tmp);
			
			// playcount numbering
			if (!playCount.containsKey(plays[i])) {
				playCount.put(plays[i], i + " ");
			}
			else playCount.put(plays[i], playCount.get(plays[i]) + (i + " "));
			
			// eleminate duplicate
			if (!genresDupEl.contains(genres[i])) genresDupEl.add(genres[i]);
		}
		
		Collections.sort(genresDupEl, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2) - map.get(o1);
			}
		});
	}
	static int[] solution(String[] genres, int[] plays) {
		calcPlay(genres, plays);
        int[] answer = new int[genresDupEl.size()*2];
        
        for (int i = 0, idx = 0; i < genresDupEl.size(); i++) {
        	ArrayList<Integer> tmp = map2.get(genresDupEl.get(i));
        	Collections.sort(tmp, Collections.reverseOrder());
        	
        	boolean flag = true;
        	String[] str = playCount.get(tmp.get(0)).split(" ");
        	if(str.length >= 2) {
        		for (int j = 0; j < 2; j++) {
        			answer[idx++] = Integer.parseInt(str[j]);
        		}
        		flag = false;
        	}
        	else if (str.length == 1) {
        		answer[idx++] = Integer.parseInt(str[0]);
        	}
        	
        	if (flag && tmp.size() > 1) {
        		str = playCount.get(tmp.get(1)).split(" ");
        		answer[idx++] = Integer.parseInt(str[0]);
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 2500, 150, 800, 2500};
		int[] res = solution(genres, plays);
		
		for (int el : res) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
}
