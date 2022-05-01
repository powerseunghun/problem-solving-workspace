package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ILoveUserName {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt = 0;
		int max = 10001, min = 10001;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0) {
				max = arr[i];
				min = arr[i];
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				cnt++;
			}
			if (arr[i] < min) {
				min = arr[i];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}
