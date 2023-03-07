package Acmicpc.As.B2.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ContestSeat5176 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), P = 0, res = 0;
		Map<Integer, Integer> map = new HashMap<>();
		String tmp = null;
		
		while(K-- > 0) {
			res = 0;
			map.clear();
			tmp = br.readLine();
			P = Integer.parseInt(tmp.split(" ")[0]);
			for (int i = 0, s = 0; i < P; i++) {
				s = Integer.parseInt(br.readLine());
				if (!map.containsKey(s)) {
					map.put(s, 1);
					continue;
				}
				res++;
			}
			sb.append(res).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
