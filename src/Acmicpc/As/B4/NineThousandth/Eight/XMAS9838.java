package Acmicpc.As.B4.NineThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class XMAS9838 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			map.put(Integer.parseInt(br.readLine()), i);
		}
		
		for (int i = 1; i <= n; i++) {
			sb.append(map.get(i) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
