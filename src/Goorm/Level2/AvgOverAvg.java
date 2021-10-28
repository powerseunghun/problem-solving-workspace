package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AvgOverAvg {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		double avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		avg = sum / (double)N;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) count++;
		}
		
		System.out.printf("%.1f %d\n", avg, count);
	}
}
