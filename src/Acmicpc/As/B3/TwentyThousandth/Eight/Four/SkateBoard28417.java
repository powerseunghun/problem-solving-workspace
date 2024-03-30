package Acmicpc.As.B3.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SkateBoard28417 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v1 = 0, max = 0;
		List<Integer> list = null;
		StringTokenizer st = null;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			v1 = Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			list = new ArrayList<>();
			while(st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			
			max = Math.max(v1+list.get(list.size()-1)+list.get(list.size()-2), max);
		}
		
		System.out.println(max);
		br.close();
	}
}
