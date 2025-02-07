package Acmicpc.As.B2.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnionMaplestory28455 {
	static int[] arr = {60, 100, 140, 200, 250};
	static int get(int X) {
		for (int i = 0; i < arr.length; i++) {
			if (X < arr[i]) return i;
		}
		return 5;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v1 = 0, v2 = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 0; i < Math.min(N, 42); i++) {
			v1 += list.get(i);
			v2 += get(list.get(i));
		}
		
		System.out.println(v1 + " " + v2);
		br.close();
	}
}
