package Acmicpc.As.B3.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SubwayFares5145 {
	static int[] arr = null;
	static Map<String, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), n = 0;
		
		for (int i = 1, val = 0; i <= K; i++) {
			map.clear();
			n = Integer.parseInt(br.readLine());
			arr = new int[n];
			for (int j = 0; j < n-1; j++) {
				arr[j+1] = Integer.parseInt(br.readLine());
			}
			for (int j = 0; j < n; j++) {
				map.put(br.readLine(), j);
			}
			val = Math.abs(map.get(br.readLine()) - map.get(br.readLine()));
			
			sb.append("Data Set " + i + ":\n");
			sb.append(arr[val] + "\n");
			if (i == K) continue;
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
