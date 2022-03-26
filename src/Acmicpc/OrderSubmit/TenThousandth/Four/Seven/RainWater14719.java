package Acmicpc.OrderSubmit.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RainWater14719 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[Integer.parseInt(br.readLine().split(" ")[1])];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0, tmp1 = 0, tmp2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			tmp1 = 0;
			tmp2 = 0;
			for (int j = 0; j < i; j++) {
				tmp1 = Math.max(tmp1, arr[j]);
			}
			for (int j = i; j < arr.length; j++) {
				tmp2 = Math.max(tmp2, arr[j]);
			}
			if (arr[i] >= tmp1 || arr[i] >= tmp2) continue;
			res += Math.min(tmp1, tmp2) - arr[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
