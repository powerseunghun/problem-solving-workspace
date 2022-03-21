package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LineUp2605 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		list.add(0);
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		for (int i = 1, val = 0; i <= N; i++) {
			val = Integer.parseInt(st.nextToken());
			list.add(i-val, i);
		}
		
		for (int i = 1; i <= N; i++) {
			sb.append(list.get(i) + " ");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
