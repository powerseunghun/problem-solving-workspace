package Acmicpc.String.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HelpChelsea11098 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> map = new HashMap<>();
		int n = Integer.parseInt(br.readLine()), p = 0, C = 0, max = 0;
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			p = Integer.parseInt(br.readLine());
			map.clear();
			max = 0;
			for (int j = 0; j < p; j++) {
				tmp = br.readLine();
				C = Integer.parseInt(tmp.split(" ")[0]);
				tmp = tmp.split(" ")[1];
				max = Math.max(C, max);
				map.put(C, tmp);
			}
			sb.append(map.get(max)+"\n");
		}
		System.out.print(sb.toString());
	}
}
