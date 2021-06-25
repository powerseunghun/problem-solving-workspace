package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthPrime4068 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), count = 0;
		int[] arr = new int[7368787+1];
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
			
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = 2*i; j < arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
				if (count == n) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}
}
