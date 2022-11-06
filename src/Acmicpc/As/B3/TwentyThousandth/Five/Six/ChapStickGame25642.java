package Acmicpc.As.B3.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChapStickGame25642 {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while (arr[t] < 5) {
			arr[t==0 ? 1 : 0] += arr[t];
			t = t == 0 ? 1 : 0;
			System.out.println(arr[0] + " " + arr[1]);
			System.out.println("t : " + t);
		}
		
		System.out.println(arr[0] >= 5 ? "yj" : "yt");
		br.close();
	}
}
