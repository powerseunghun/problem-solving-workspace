package Acmicpc.OrderSubmit.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoRuleOperation15726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[3];
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		max = Math.max(max, (int)(arr[0]*arr[1]/arr[2]));
		max = Math.max(max, (int)(arr[0]/arr[1]*arr[2]));
		
		System.out.println(max);
		br.close();
	}
}
