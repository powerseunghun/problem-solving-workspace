package Goorm.Level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class RadixSort {
	static List<Queue<Integer>> bucket = new ArrayList<>();
	static void bucketInit() {
		for (int i = 0; i < 10; i++) {
			bucket.add(new LinkedList<>());
		}
	}
	static int getDigit(int n) {
		int digit = 0;
		while (n != 0) {
			digit++;
			n /= 10;
		}
		return digit;
	}
	static void radixSort(int[] arr, int maxDigit) {
		int div = 1;
		for (int digit = 0; digit < maxDigit; digit++) {
			div *= 10;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < (div/10)) bucket.get(0).add(arr[i]);
				else {
					bucket.get(arr[i]%div/(div/10)).add(arr[i]);
				}
			}
			
			for (int i = 0, idx = 0; i < bucket.size(); i++) {
				Queue<Integer> q = bucket.get(i);
				while (!q.isEmpty()) {
					arr[idx++] = q.poll();
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), maxDigit = 0;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		bucketInit();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			maxDigit = Math.max(maxDigit, getDigit(arr[i]));
		}
		
		radixSort(arr, maxDigit);
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i != arr.length-1) sb.append(" ");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
