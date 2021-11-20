package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MovePlan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), sum = 0, house = 0;
		double avg = 0, diff = Integer.MAX_VALUE;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		avg = (double)sum / N;
		
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs((arr[i] - avg)) <= diff) {
				diff = Math.abs(arr[i]-avg);
				house = arr[i];
			}
		}
		sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += Math.abs(arr[i] - house);
		}
		System.out.println(sum);
		br.close();
	}
}
