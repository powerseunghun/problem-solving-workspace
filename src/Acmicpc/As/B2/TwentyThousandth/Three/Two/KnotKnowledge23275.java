package Acmicpc.As.B2.TwentyThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class KnotKnowledge23275 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<>();
		StringTokenizer st = null;
		int v = 0;
		br.readLine();
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				if (i == 0) set.add(v);
				else set.remove(v);
			}
		}
		
		System.out.println(new ArrayList<Integer>(set).get(0));
		br.close();
	}
}
