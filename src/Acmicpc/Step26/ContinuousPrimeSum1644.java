package Acmicpc.Step26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ContinuousPrimeSum1644 {
	static void initList(int[] arr, ArrayList<Integer> list) {
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = i * 2; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) list.add(i);
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine()), left = 0, right = 0, val = 0, count = 0;
		int[] arr = new int[N+1];
		initList(arr, list);
		
//		System.out.println(list.size());
		while (true) {
			if (val >= N) {
				val -= list.get(left);
				left++;
			}
			else if (right == list.size()) break;
			else {
				val += list.get(right);
				right++;
			}
			if (val == N) count++;
		}
		System.out.println(count);
	}
}
