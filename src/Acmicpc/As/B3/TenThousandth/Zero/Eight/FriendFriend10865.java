package Acmicpc.As.B3.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FriendFriend10865 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[N+1];
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			arr[Integer.parseInt(tmp.split(" ")[0])]++;
			arr[Integer.parseInt(tmp.split(" ")[1])]++;
		}
		
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
