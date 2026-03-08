package Acmicpc.As.B3.ThirtyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WaterJournal31312 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1]);
		int b = Integer.parseInt(str.split(" ")[2]);
		
		for (int i = 0; i < n-1; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		if (!list.contains(a)) {
			sb.append(!list.contains(b) ? -1 : a).append("\n");
		} else if (!list.contains(b)) {
			sb.append(b).append("\n");
		} else {
			for (int i = a; i <= b; i++) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
