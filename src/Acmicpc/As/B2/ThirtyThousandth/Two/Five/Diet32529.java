package Acmicpc.As.B2.ThirtyThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Diet32529 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = -1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = N-2; i >= 0; i--) {
			arr[i] += arr[i+1];
		}
		
		for (int i = N-1; i >= 0; i--) {
			if (arr[i] >= M) {
				res = i+1;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
