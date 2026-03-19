package Acmicpc.As.B2.TwentyThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReconstructSum21180 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0, res = 0;
		boolean flag = false;
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		for (int el : arr) {
			if (sum - el == el) {
				flag = true;
				res = el;
				break;
			}
		}
		
		System.out.println(flag ? res : "BAD");
		br.close();
	}
}
