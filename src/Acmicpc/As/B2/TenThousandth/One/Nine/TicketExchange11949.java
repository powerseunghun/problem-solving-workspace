package Acmicpc.As.B2.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicketExchange11949 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j < N; j++) {
				if (arr[j-1] % i > arr[j] % i) {
					int val = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = val;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
