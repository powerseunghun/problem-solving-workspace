package Programmers.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Thief {
	static int solution(int[] money) {
		int[] arr = new int[money.length];
		int max = 0;
		
		if (money.length == 1) return money[0];
		else if (money.length == 2) return Math.max(money[0], money[1]);

		arr[0] = money[0];
		arr[1] = money[0];
		for (int i = 2; i < money.length-1; i++) {
			arr[i] = Math.max(arr[i-2]+money[i], arr[i-1]);
		}
		max = Math.max(max, arr[money.length-2]);
		
		arr[0] = 0;
		arr[1] = money[1];
		for (int i = 2; i < money.length; i++) {
			arr[i] = Math.max(arr[i-2]+money[i], arr[i-1]);
		}
		max = Math.max(max, arr[money.length-1]);
		
		return max;
	}
	public static void main(String[] args) {
		int[] money = {1, 2, 3, 1};
		
		System.out.println(solution(money));
	}
}