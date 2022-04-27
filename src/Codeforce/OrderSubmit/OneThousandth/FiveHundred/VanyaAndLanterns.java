package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VanyaAndLanterns {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int l = Integer.parseInt(tmp.split(" ")[1]);
		double res = 0;
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		res = (double)(l-arr[arr.length-1]);
		
		for (int i = 0; i < arr.length-1; i++) {
			res = Math.max(res, (arr[i+1]-arr[i]) / 2.0);
		}
		
		System.out.printf("%.10f\n", Math.max(res, (double)arr[0]));
		br.close();
	}
}
