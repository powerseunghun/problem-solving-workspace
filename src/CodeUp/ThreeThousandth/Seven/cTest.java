package CodeUp.ThreeThousandth.Seven;

import java.util.ArrayList;

public class cTest {
	static int[] arr = null;
	static int[] idx = null;
	static ArrayList<Integer> list = new ArrayList<>();
	static void solution(int d, int w, int c, int[] items) {
		if (d == 2) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			if (sum == w) {
				for (int i = 0; i < 2; i++) {
					list.add(idx[i]);
				}
			}
			return;
		}
		
		for (int i = c; i < items.length; i++) {
			arr[d] = items[i];
			idx[d] = i;
			solution(d+1, w, i+1, items);
		}
	}
	public static void main(String[] args) {
		int[] items = {15, 7, 11, 2};
		int w = 9;
		arr = new int[4];
		idx = new int[4];
		
		solution(0, w, 0, items);
		
		if (list.size() == 0) {
			list.add(-1);
			list.add(-1);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
