package Acmicpc.GreedyAlgorithm.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Ship1092 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), M = 0, time = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> crain = new ArrayList<>(), box = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			crain.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(crain, Collections.reverseOrder());
		
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(box, Collections.reverseOrder());
		
		if (crain.get(0) < box.get(0)) {
			System.out.println("-1");
			return;
		}
		
		while (!box.isEmpty()) {
			int idx = 0;
			for (int i = 0; i < crain.size();) {
				if (idx == box.size()) break;
				if (crain.get(i) >= box.get(idx)) {
					box.remove(idx);
					i++;
				}
				else idx++;
				
			}
			time++;
		}
		System.out.println(time);
	}
}
