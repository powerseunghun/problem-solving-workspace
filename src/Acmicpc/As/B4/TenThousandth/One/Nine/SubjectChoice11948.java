package Acmicpc.As.B4.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubjectChoice11948 {
	static int[] arr = new int[6];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (i > 3) continue;
			sum += arr[i];
		}
		
		sum -= Math.min(Math.min(arr[0], arr[1]), Math.min(arr[2], arr[3]));
		sum += Math.max(arr[4], arr[5]);
		
		System.out.println(sum);
		br.close();
	}
}
