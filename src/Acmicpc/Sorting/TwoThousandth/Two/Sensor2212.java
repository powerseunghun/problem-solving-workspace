package Acmicpc.Sorting.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Sensor2212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), K = Integer.parseInt(br.readLine()); 
		int sum = 0;
		int[] arr = new int[N];
		Integer[] diff = new Integer[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < diff.length; i++) {
			diff[i] = arr[i+1] - arr[i];
		}
		Arrays.sort(diff, Collections.reverseOrder());
		
		for (int i = K-1; i < diff.length; i++) {
			sum += diff[i];
		}
		System.out.println(sum);
	}
}
