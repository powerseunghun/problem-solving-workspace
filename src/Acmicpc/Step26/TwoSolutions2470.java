package Acmicpc.Step26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TwoSolutions2470 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int curDiff = Integer.MAX_VALUE, left = 0, right = 0;
		int choiceLeft = 0, choiceRight = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		right = list.size()-1;
		while (left < right) {
			int val = list.get(left) + list.get(right);
			if (Math.abs(0 - val) < curDiff) {
				curDiff = Math.abs(0 - val);
				choiceLeft = left;
				choiceRight = right;
			}
			
			if (val <= 0) left++;
			else right--;
		}
		System.out.println(list.get(choiceLeft) + " " + list.get(choiceRight));
		
	}
}
