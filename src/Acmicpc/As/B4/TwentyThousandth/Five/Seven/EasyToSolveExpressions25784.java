package Acmicpc.As.B4.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EasyToSolveExpressions25784 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		if (arr[0]+arr[1] == arr[2]) {
			System.out.println(1);
		}
		else if (arr[0]*arr[1] == arr[2]) {
			System.out.println(2);
		}
		else System.out.println(3);
		
		br.close();
	}
}
