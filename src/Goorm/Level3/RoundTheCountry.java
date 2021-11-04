package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RoundTheCountry {
	static int avg = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0, val1 = 0, val2 = 0;
		int[] arr = new int[n];
		PriorityQueue<Integer> pq = null;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		avg = sum / n;
		pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Math.abs(o1-avg) - Math.abs(o2-avg);
			}
		});
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		sum = 0;
		
		while (!pq.isEmpty()) {
			val1 = pq.poll();
			if (val1 == avg) continue;
			
			val2 = pq.poll();
			
			sum += (avg - Math.min(val1, val2));
		}
		
		System.out.println(sum);
	}
}
