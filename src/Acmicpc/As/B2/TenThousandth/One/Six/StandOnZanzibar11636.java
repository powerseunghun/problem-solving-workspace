package Acmicpc.As.B2.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StandOnZanzibar11636 {
	static List<Integer> list = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), v = 0, res = 0;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			list = new ArrayList<Integer>();
			res = 0;
			while(st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				if (v == 0) break;
				list.add(v);
			}
			for (int i = 1; i < list.size(); i++) {
				res += Math.max(0, list.get(i)-2*list.get(i-1));
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
