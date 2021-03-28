package Acmicpc.Step21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AbsoluteValueHeap11286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), x = 0;
		PriorityQueue<Integer> list = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1) == Math.abs(o2)) {
					if (o1 > o2) {
						return 1;
					}
					else {
						return -1;
					}
				}
				else {
					return Math.abs(o1) - Math.abs(o2);
				}
			}
		});
		
		for (int i = 0; i < N; i++) {
			x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (list.size() == 0) {
					sb.append(0 + "\n");
				}
				else {
					sb.append(list.poll() + "\n");
				}
			}
			else {
				list.add(x);
			}
		}
		System.out.println(sb);
	}
}
