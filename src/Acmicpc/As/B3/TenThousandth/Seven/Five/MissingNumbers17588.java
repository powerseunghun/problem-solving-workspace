package Acmicpc.As.B3.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumbers17588 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), idx = 1;
		boolean flag = true;
		
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		
		for (int el : list) {
			while (el != idx) {
				sb.append(idx + "\n");
				flag = false;
				idx++;
			}
			idx = el+1;
		}
		
		System.out.print(flag ? "good job\n" : sb.toString());
		br.close();
	}
}
