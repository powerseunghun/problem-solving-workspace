package Acmicpc.As.B3.ThirtyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Scholarship31394 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		if (arr[0] == 3) {
			System.out.println("None");
		} else if (arr[0] == 5) {
			System.out.println("Named");
		} else if (sum / (double)n >= 4.5) {
			System.out.println("High");
		} else {
			System.out.println("Common");
		}
		
		br.close();
	}
}
