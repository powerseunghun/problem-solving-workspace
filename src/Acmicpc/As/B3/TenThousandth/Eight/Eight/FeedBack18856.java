package Acmicpc.As.B3.TenThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FeedBack18856 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		for (int i = 3; i < N; i++) {
			list.add(i);
		}
		list.add(997);
		
		System.out.println(N);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		br.close();
	}
}
