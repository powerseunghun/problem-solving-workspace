package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WheelRotation6060 {
	static Map<Integer, Integer> a = new HashMap<>();
	static Map<Integer, Integer> b = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), S = 0, D = 0, C = 0, res = 0, v = 1;
		String str = null;
		
		for (int i = 0; i < N-1; i++) {
			str = br.readLine();
			S = Integer.parseInt(str.split(" ")[0]);
			D = Integer.parseInt(str.split(" ")[1]);
			C = Integer.parseInt(str.split(" ")[2]);
			a.put(S, D);
			b.put(S, C);
		}
		
		for (int i = 0; i < N-1; i++) {
			if (b.containsKey(v) && b.get(v) == 1) {
				res++;
			}
			v = a.get(v);
		}
		
		System.out.println(res&1);
		br.close();
	}
}
