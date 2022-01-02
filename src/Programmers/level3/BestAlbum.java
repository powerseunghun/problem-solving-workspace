package Programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
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
	static Map<Integer, Integer> playCount = new HashMap<>();
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
			Collections.sort(tmp, Collections.reverseOrder());
			map2.put(genres[i], tmp);
			
			// playcount numbering
			if (!playCount.containsKey(plays[i])) {
				playCount.put(plays[i], i);
			}
			
			// eleminate duplicate
			set.add(genres[i]);
		}
		for (String str : set) genresDupEl.add(str);
		
		Collections.sort(genresDupEl, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2) - map.get(o1);
			}
		});
	}
	static int[] solution(String[] genres, int[] plays) {
		calcPlay(genres, plays);
        int[] answer = new int[set.size()*2];
        
        for (int i = 0, idx = 0; i < genresDupEl.size(); i++) {
        	ArrayList<Integer> tmp = map2.get(genresDupEl.get(i));
        	for (int j = 0; j < (tmp.size() >= 2 ? 2 : 1); j++) {
        		answer[idx++] = playCount.get(tmp.get(j));
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] res = solution(genres, plays);
		
//		for (int el : res) {
//			System.out.print(el + " ");
//		}
//		System.out.println();
	}
}
