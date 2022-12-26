package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SimpleSum26531 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<String> list = new ArrayList<>();
		int[] arr = new int[3];
		
		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		for (int i = 0, w = 0; i < arr.length; i++, w+=2) {
			arr[i] = Integer.parseInt(list.get(w));
		}
		
		System.out.println(arr[0]+arr[1] == arr[2] ? "YES" : "NO");
		br.close();
	}
}
