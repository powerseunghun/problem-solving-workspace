package CodeUp.ThreeThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ContinueSectionMaxSum3700 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int[] arr = new int[Integer.parseInt(br.readLine())];
		int[] sums = new int[arr.length];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.fill(sums, 0);
		
		sums[0] = arr[0];
		for (int i = 1; i < sums.length; i++) {
			sums[i] = sums[i-1] + arr[i] > arr[i] ? sums[i-1] + arr[i] : arr[i];
		}
		
		for (int i = 0; i < sums.length; i++) {
			max = max >= sums[i] ? max : sums[i];
		}
		
		System.out.println(max);
	}
}
