package Acmicpc.As.B3.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Клавиатура21679 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.readLine();
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			arr[Integer.parseInt(st.nextToken())]--;
		}
		
		for (int i = 1; i < arr.length; i++) {
			sb.append((arr[i] < 0 ? "yes" : "no") + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
