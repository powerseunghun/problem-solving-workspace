package Acmicpc.As.B3.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LicenstToLaunch17912 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE, res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			min = Math.min(arr[i], min);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
