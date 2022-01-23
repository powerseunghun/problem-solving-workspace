package Acmicpc.OrderSubmit.TenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RewardHunter15953 {
	static ArrayList<Integer> list1 = new ArrayList<>();
	static ArrayList<Integer> list2 = new ArrayList<>();
	static void init() {
		int[] arr1 = {500, 300, 200, 50, 30, 10};
		int[] arr2 = {512, 256, 128, 64, 32};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j <= i; j++) {
				list1.add(arr1[i]);
			}
		}
		for (int i = 0, v = 1; i < arr2.length; i++, v *= 2) {
			for (int j = 0; j < v; j++) {
				list2.add(arr2[i]);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		init();
		
		for (int i = 0, a = 0, b = 0, sum = 0; i < T; i++, sum = 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a >= 1 && a <= 21) sum += list1.get(a-1);
			if (b >= 1 && b <= 31) sum += list2.get(b-1);
			sb.append((sum*10000) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
