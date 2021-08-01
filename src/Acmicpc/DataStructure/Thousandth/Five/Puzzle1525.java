package Acmicpc.DataStructure.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Puzzle1525 {
	// memory limit 32mb two dimension time over
	static String swap(String str, int curIdx, int newIdx) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			if (i == curIdx) {
				sb.append(str.charAt(newIdx));
			}
			else if (i == newIdx) {
				sb.append(str.charAt(curIdx));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<String> q = new LinkedList<>();
		Set<String> check = new HashSet<>();
		Map<String, Integer> countCheck = new HashMap<>();
		int curIdx = 0, newIdx = 0;
		int[] idxs = {-1, 1, -3, 3};
		// 123405678 -1, 1, -3 ,3
		String str = br.readLine().replaceAll(" ", "") + br.readLine().replaceAll(" ", "") + br.readLine().replaceAll(" ", "");
		
		check.add(str);
		q.add(str);
		countCheck.put(str, 0);
		
		while(!q.isEmpty()) {
			String t = q.poll();
			
			if (t.equals("123456780")) {
				System.out.println(countCheck.get("123456780"));
				return;
			}
			curIdx = t.indexOf('0');
			
			for (int j = 0; j < idxs.length; j++) {
				newIdx = curIdx + idxs[j];
				if (newIdx < 0 || newIdx >= 9) continue;
				if ((curIdx % 3 == 0 && j == 0) || (curIdx % 3 == 2 && j == 1)) continue;
				
				String newStr = swap(t, curIdx, newIdx);
				countCheck.put(newStr, countCheck.get(t)+1);
				if (!check.contains(newStr)) {
					check.add(newStr);
					q.add(newStr);
				}
			}
		}
		System.out.println("-1");
	}
}
 