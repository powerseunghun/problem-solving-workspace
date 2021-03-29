package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test6 {
	public int[] solution(int N, int[] coffee_times) {
		int[] answer = new int[coffee_times.length];
		int next = N, index = 0;
		ArrayList<Integer> making = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			making.add(coffee_times[i]);
		}
		
		while (index >= coffee_times.length) {
			for (int i = 0; i < making.size(); i++) {
				making.set(i, making.get(i)-1);
			}
			for (int i = 0; i < making.size(); i++) {
				if (making.get(i) == 0) {
					answer[index++] = making.get(i);
				}
			}
			
		}
//		for (int i = 0; i < N; i++) {
//			making.add(coffee_times[i]);
//		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> coffee_times = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		// 5 == coffee_times base size
//		while(result.size() != 3) {
//			for (int i = 0; i < coffee.size(); i++) {
//				coffee.set(i, coffee.get(i)-1);
//				if (coffee.get(i) == 0) {
//					result.add(i);
//				}
//			}
//		}
		System.out.println(result);
	}
}
