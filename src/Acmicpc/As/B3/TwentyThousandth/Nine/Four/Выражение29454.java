package Acmicpc.As.B3.TwentyThousandth.Nine.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Выражение29454 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0, res = -1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]*2 == sum) {
				res = i+1;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
