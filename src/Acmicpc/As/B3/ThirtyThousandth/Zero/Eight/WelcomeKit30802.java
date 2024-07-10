package Acmicpc.As.B3.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WelcomeKit30802 {
	static final int l = 6;
	static int[] arr = new int[l];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), T = 0, P = 0, res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = br.readLine();
		T = Integer.parseInt(str.split(" ")[0]);
		P = Integer.parseInt(str.split(" ")[1]);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int el : arr) {
			res += el/T;
			res = el%T != 0 ? res+1 : res;
		}
		
		System.out.println(res);
		System.out.println(N/P + " " + N%P);
		br.close();
	}
}
