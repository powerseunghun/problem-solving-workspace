package Acmicpc.As.B2.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 最長昇順連続部分列18416 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0, c = 1; i < n-1; i++, c=1) {
			for (int j = i+1; j < n; j++) {
				if (arr[j] >= arr[j-1]) c++;
				else break;
			}
			res = Math.max(res, c);
		}
		
		System.out.println(res);
		br.close();
	}
}
