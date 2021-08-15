package Acmicpc.Sorting.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BindNumber1744 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int f = 0, b = 0;
		for (f = 0; f < arr.length-1; f+=2) {
			if (arr[f] < 1 && arr[f+1] < 1) {
				sum += (arr[f] * arr[f+1]);
			}
			else break;
		}
		for (b = N-1; b > 0 ;b-=2) {
			if (arr[b] > 1 && arr[b-1] > 1) {
				sum += arr[b] * arr[b-1];
			}
			else break;
		}
		while (f <= b) sum += arr[f++];
		System.out.println(sum);
	}
}
