package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHouse {
	static int getHeight(List<Integer> first, List<Integer> second) {
		List<Integer> containers = new ArrayList<>();
		int fIdx = 0, sIdx = 0, cur = Integer.MAX_VALUE;
		Collections.sort(first, Collections.reverseOrder());
		Collections.sort(second, Collections.reverseOrder());
		while (fIdx < first.size() && sIdx < second.size()) {
			if (containers.size() % 2 == 0) {
				if (first.get(fIdx) < cur) {
					containers.add(first.get(fIdx));
					cur = first.get(fIdx);
				}
				fIdx++;
			}
			else {
				if (second.get(sIdx) < cur) {
					containers.add(second.get(sIdx));
					cur = second.get(sIdx);
				}
				sIdx++;
			}
		}
		if (fIdx < first.size() && first.get(fIdx) < cur) {
			containers.add(first.get(fIdx));
		}
		if (sIdx < second.size() && second.get(sIdx) < cur) {
			containers.add(second.get(sIdx));
		}
		
		return containers.size();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		List<Integer> black = new ArrayList<>();
		List<Integer> white = new ArrayList<>();
		
		for (int i = 0, val = 0; i < N; i++) {
			val = Integer.parseInt(br.readLine());
			if (val < 0) white.add(Math.abs(val));
			else black.add(val);
		}
		
		max = Math.max(getHeight(black, white), getHeight(white, black));
		System.out.println(max);
		br.close();
	}
}
