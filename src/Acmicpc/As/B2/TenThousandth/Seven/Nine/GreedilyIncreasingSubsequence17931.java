package Acmicpc.As.B2.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class GreedilyIncreasingSubsequence17931 {
	static int[] arr = null;
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int el : arr) {
			if (el <= v) continue;
			list.add(el);
			v = el;
		}
		
		System.out.println(list.size());
		for (int el : list) {
			System.out.print(el + " ");
		}
		br.close();
	}
}
