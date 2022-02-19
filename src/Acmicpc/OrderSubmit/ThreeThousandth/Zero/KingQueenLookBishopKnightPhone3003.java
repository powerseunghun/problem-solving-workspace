package Acmicpc.OrderSubmit.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KingQueenLookBishopKnightPhone3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] -= Integer.parseInt(st.nextToken());
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
