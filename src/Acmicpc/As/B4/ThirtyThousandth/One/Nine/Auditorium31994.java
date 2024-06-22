package Acmicpc.As.B4.ThirtyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Auditorium31994 {
	static final int l = 7;
	static Map<Integer, String> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int v = 0, max = 0;
		
		for (int i = 0; i < l; i++) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[1]);
			map.put(v, str.split(" ")[0]);
			max = Math.max(max, v);
		}
		
		System.out.println(map.get(max));
		br.close();
	}
}
