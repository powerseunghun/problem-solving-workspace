package Acmicpc.As.B2.TwentyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiplication24421 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					if (arr[i]*arr[j] == arr[k]) res++;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
