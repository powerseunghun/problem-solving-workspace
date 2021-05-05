package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertSort1443 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), key = 0, j = 0;
		int[] arr = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 2; i <= n; i++) {
			key = arr[i];
			for (j = i-1; j >= 0 && arr[j] > key; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println(arr[i]);
		}
	}
}
