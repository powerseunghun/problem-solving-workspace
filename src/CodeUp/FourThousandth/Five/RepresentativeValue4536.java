package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RepresentativeValue4536 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int[] count = new int[1000];
		Arrays.fill(count, 0);
		int sum = 0, maxCount = 0, rValue = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			count[arr[i]] += 1;
			maxCount = count[arr[i]] >= maxCount ? count[arr[i]] : maxCount;
		}
		for (int i = 0; i < count.length; i += 10) {
			if (maxCount == count[i]) {
				rValue = i;
				break;
			}
		}
		System.out.println(sum / arr.length);
		System.out.println(rValue);
	}
}
