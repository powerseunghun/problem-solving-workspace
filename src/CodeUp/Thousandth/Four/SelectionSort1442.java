package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort1442 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), min = 0, temp = 0;
		int[] arr = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 1; i < n; i++) {
			min = i;
			for (int j = i + 1; j <= n; j++) {
				min = arr[j] < arr[min] ? j : min;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for (int i = 1; i <= n; i++) {
			System.err.println(arr[i]);
		}
	}
}
