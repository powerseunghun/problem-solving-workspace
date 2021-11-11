package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TissueFactory {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int W = Integer.parseInt(tmp.split(" ")[1]);
		long sum = 0, need = 0, max = Long.MIN_VALUE; 
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(arr[i], max);
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			need += (Math.abs(max) - arr[i]);
		}
		
		if (W < need) {
			System.out.println("No way!");
			return;
		}
		sum += W;
		System.out.println((int)(sum / N));
		
		br.close();
	}
}
