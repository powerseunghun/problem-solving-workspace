package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrimeInInterval3071 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[b+1];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = i*2; j < arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		
		for (int i = a; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
