package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataArrangement1452 {
	static void qSort(int[] arr, int l, int r) {
		int left = l, right = r, p = arr[(left+right) / 2];
		int tmp = 0;
		
		while (left <= right) {
			while (arr[left] < p) left++;
			while (arr[right] > p) right--;
			
			if (left <= right) {
				if (left != right) {
					tmp = arr[left];
					arr[left] = arr[right];
					arr[right] = tmp;
				}
				left++;
				right--;
			}
		}
		if (l < right) qSort(arr, l, right);
		if (left < r) qSort(arr, left, r);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		qSort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
