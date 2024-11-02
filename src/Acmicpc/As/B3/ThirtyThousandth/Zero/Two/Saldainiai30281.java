package Acmicpc.As.B3.ThirtyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Saldainiai30281 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0, v = 0;
		List<Integer> list = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (v % 2 == 0) {
				res += v;
			} else {
				list.add(v);
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 1; i < list.size(); i+=2) {
			res += list.get(i)+list.get(i-1);
		}
		
		System.out.println(res/2);
		br.close();
	}
}
