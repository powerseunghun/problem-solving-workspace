package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoormPark {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE, min = 0, sum = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(arr[i], max);
			sum += arr[i];
		}
		sum += M;
		
		if (((double)sum/N) != (int)(sum/N)) {
			min = sum/N+1;
		}
		else min = sum/N;
		
		max += M;
		
		System.out.println(min + " " + max);
		br.close();
	}
}
