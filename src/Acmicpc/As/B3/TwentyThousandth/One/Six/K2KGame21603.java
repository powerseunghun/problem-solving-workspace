package Acmicpc.As.B3.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class K2KGame21603 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			if ((i % 10 != K % 10) && (i % 10 != (2*K) % 10)) {
				list.add(i);
				sb.append(i + " ");
			}
		}
		
		System.out.println(list.size());
		if (!sb.toString().equals("")) {
			System.out.println(sb.toString());
		}
		
		br.close();
	}
}
