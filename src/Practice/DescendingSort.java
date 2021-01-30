package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (Integer) sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
