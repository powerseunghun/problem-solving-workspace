package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoinTossing9947 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, p1 = null, p2 = null;
		int T = 0;
		Map<String, Integer> map = null;
		
		while(true) {
			str = br.readLine();
			p1 = str.split(" ")[0];
			p2 = str.split(" ")[1];
			if (p1.equalsIgnoreCase("#") && p2.equalsIgnoreCase("#")) break;
			map = Stream.of(new Object[][] {
				{p1, 0},{p2, 0}
			}).collect(Collectors.toMap(item -> (String)item[0], item->(Integer)item[1]));
			T = Integer.parseInt(br.readLine());
			
			while(T-- > 0) {
				str = br.readLine();
				if (str.split(" ")[0].equals(str.split(" ")[1])) {
					map.put(p1, map.get(p1)+1);
				} else {
					map.put(p2, map.get(p2)+1);
				}
			}
			sb.append(p1 + " " + map.get(p1) + " " + p2 + " " + map.get(p2)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
