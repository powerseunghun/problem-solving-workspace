package Acmicpc.As.B4.TenThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HardChoice15059 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0, val = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			val = Integer.parseInt(st.nextToken());
			if (arr[i] < val) {
				sum += val - arr[i];
			}
		}
		
		System.out.println(sum);
		br.close();
	}
}
