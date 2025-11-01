package Acmicpc.As.B3.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClosingEarly34298 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(str.split(" ")[0]);
		int S = Integer.parseInt(str.split(" ")[1]);
		int N = Integer.parseInt(str.split(" ")[2]), res = -1;
		long sum = 0;
		boolean flag = false;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if (R != 0) {
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (sum % S == R % S) {
					res = i+1;
					flag = true;
					break;
				}
			}
		}
		
		System.out.println(R == 0 ? 0 : flag ? res : -1);
		br.close();
	}
}
