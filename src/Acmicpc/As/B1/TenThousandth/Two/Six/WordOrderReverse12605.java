package Acmicpc.As.B1.TenThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WordOrderReverse12605 {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			list.clear();
			while (st.hasMoreTokens()) {
				list.add(st.nextToken());
			}
			
			sb.append("Case #").append(i).append(": ");
			for (int j = list.size()-1; j >= 0; j--) {
				sb.append(list.get(j));
				if (i == 0) continue;
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
