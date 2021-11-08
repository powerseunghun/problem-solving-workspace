package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Badminton {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] china = new int[5];
		int curDiff = 0, idx = 0, win = 0;
		List<Integer> korea = new ArrayList<>();
		StringTokenizer st = null;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					china[j] = Integer.parseInt(st.nextToken());
				}
				else korea.add(Integer.parseInt(st.nextToken()));
			}
		}
		Collections.sort(korea);
		
		for (int i = 0, target = 0; i < china.length; i++) {
			target = china[i];
			idx = -1;
			for (int j = 0, diff = Integer.MAX_VALUE; j < korea.size(); j++) {
				curDiff = Math.abs(korea.get(j) - target);
				if (curDiff < diff && korea.get(j) >= target) {
					idx = j;
					diff = curDiff;
				}
			}
			if (idx != -1) {
				korea.remove(idx);
				win++;
			}
		}
		System.out.println(win);
	}
}
