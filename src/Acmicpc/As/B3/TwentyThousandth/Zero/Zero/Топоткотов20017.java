package Acmicpc.As.B3.TwentyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Топоткотов20017 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int a = Integer.parseInt(tmp.split(" ")[2]), res = 0;
		arr = new int[n*m];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = arr.length-1; i-m >= 0; i--) {
			if (arr[i] > arr[i-m] * 2) res+=a;
		}
		
		System.out.println(res);
		br.close();
	}
}
