package Acmicpc.As.B4.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SungGoHan34236 {
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), A = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		A = (arr[N-1]-arr[0])/(N-1);
		
		System.out.println(arr[N-1]+A);
		br.close();
	}
}
