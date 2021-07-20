package Acmicpc.Step26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TwoNumbersSum3273 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0, x = 0;
		int left = 0, right = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(br.readLine());
		
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		left = 0;
		right = list.size()-1;
		while (left < right) {
			int val = list.get(left) + list.get(right);
			if (val == x) count++;
			
			// pointer control
			if (val <= x) left++;
			else right--;
		}
		System.out.println(count);
	}
}
