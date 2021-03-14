package Acmicpc.Step12;


import java.util.Arrays;
import java.util.Scanner;

public class NumberArrangement2751MethodVer {
	public int[] mergeSort(int[] array) {
		if (array.length < 2) {
			return array;
		}
		int m = 0, l = 0, h = 0, mid = array.length / 2;
		int[] lowArray = mergeSort(Arrays.copyOfRange(array, 0, mid));
		int[] highArray = mergeSort(Arrays.copyOfRange(array, mid, array.length));
		int[] mergeArray = new int[array.length];
		
		while (l < lowArray.length && h < highArray.length) {
			mergeArray[m++] = lowArray[l] < highArray[h] ? lowArray[l++] : highArray[h++];
		}
		
		while (l < lowArray.length) {
			mergeArray[m++] = lowArray[l++];
		}
		while (h < highArray.length) {
			mergeArray[m++] = highArray[h++];
		}
		
		return mergeArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N], mergeArray = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		mergeArray = new NumberArrangement2751MethodVer().mergeSort(array);
		
		for (int i = 0; i < mergeArray.length; i++) {
			sb.append(mergeArray[i] + "\n");
		}
		System.out.println(sb);
	}
}
