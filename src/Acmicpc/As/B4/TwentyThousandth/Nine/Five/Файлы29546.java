package Acmicpc.As.B4.TwentyThousandth.Nine.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Файлы29546 {
	static Map<Integer, String> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), r = 0, a = 0, b = 0;
		String str = null;
		
		for (int i = 1; i <= n; i++) {
			str = br.readLine();
			map.put(i, str);
		}
		r = Integer.parseInt(br.readLine());
		
		while(r-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			for (int i = a; i <= b; i++) {
				sb.append(map.get(i)).append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
