package Acmicpc.As.B2.TwentyThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SuspiciousEvent27622 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String seq = null;
		int res = 0;
		
		while (st.hasMoreTokens()) {
			seq = st.nextToken();
			if (seq.contains("-")) {
				if (!map.containsKey(seq.replaceAll("-", ""))) res++;
				else map.remove(seq.replaceAll("-", ""));
			}
			else {
				if (map.containsKey(seq)) res++;
				else map.put(seq, 1);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
