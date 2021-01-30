package Practice;

import java.util.Scanner;

public class BubbleSortGetStage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		int[] arr = new int[n];
		boolean swap = false;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			swap = false;
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					swap = true;
				}
			}
			if (swap) count++;
		}
		System.out.println(count);
	}
}
