package Codeforce.OrderSubmit.OneThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XeniaAndRingroad {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long time = 0;
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[m];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0) time = arr[i]-1;
			else {
				if (arr[i-1] < arr[i]) time += (arr[i]-arr[i-1]);
				else if (arr[i-1]>arr[i]) time += (arr[i]+n-arr[i-1]);
			}
		}
		
		System.out.println(time);
		br.close();
	}
}
