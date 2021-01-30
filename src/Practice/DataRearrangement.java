package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataRearrangement {
	public void mapInit(Map<Integer, Integer> list, int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			list.put(arr2[i], i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> list = new HashMap<>();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		new DataRearrangement().mapInit(list, arr2);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(list.get(arr[i]) + " ");
		}
		
	}
}
