package Acmicpc.Step12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Statistics2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), sum = 0, max = 0, min = 0, modeCount = 0, mode = 0;
		int[] num = new int[N];
		Map<Integer, Integer> count = new HashMap<>();
		ArrayList<Integer> modes = new ArrayList<>();
		
		num[0] = sc.nextInt();
		max = num[0];
		min = num[0];
		sum += num[0];
		count.put(num[0], 1);
		
		for (int i = 1; i < N; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
			if (!count.containsKey(num[i])) {
				count.put(num[i], 1);
			}
			else {
				count.put(num[i], count.get(num[i]) + 1);
			}
			if (max < num[i]) max = num[i];
			if (min > num[i]) min = num[i];
		}
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			if (count.get(num[i]) > modeCount) {
				modeCount = count.get(num[i]);
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (count.containsKey(num[i])) {
				if (count.get(num[i]) == modeCount) {
					modes.add(num[i]);
					count.remove(num[i]);
				}
			}
		}
		if (modes.size() == 1) {
			mode = modes.get(0);
		}
		else {
			modes.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 - o2;
				}
			});
			mode = modes.get(1);
		}
		System.out.println(Math.round(sum / (double)N));
		System.out.println(num[num.length / 2]);
		System.out.println(mode);
		System.out.println(max - min);
	}
}
