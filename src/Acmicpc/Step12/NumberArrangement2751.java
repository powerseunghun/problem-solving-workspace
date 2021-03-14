package Acmicpc.Step12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberArrangement2751 {
//	public int[] mergeSort(int[] array) {
//		if (array.length < 2) {
//			return array;
//		}
//		int m = 0, h = 0, l = 0, mid = array.length / 2;
//		int[] lowArray = mergeSort(Arrays.copyOfRange(array, 0, mid));
//		int[] highArray = mergeSort(Arrays.copyOfRange(array, mid, array.length));
//		int[] mergeArray = new int[array.length];
//		while(l < lowArray.length && h < highArray.length) {
//			mergeArray[m++] = lowArray[l] < highArray[h] ? lowArray[l++] : highArray[h++];
//		}
//		while (l < lowArray.length) {
//			mergeArray[m++] = lowArray[l++];
//		}
//		while (h < highArray.length) {
//			mergeArray[m++] = highArray[h++];
//		}
//		return mergeArray;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> array = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			array.add(sc.nextInt());
		}
		Collections.sort(array);
		
		for (int i = 0; i < array.size(); i++) {
			sb.append(array.get(i) + "\n");
		}
		
		System.out.println(sb);
	}
}
