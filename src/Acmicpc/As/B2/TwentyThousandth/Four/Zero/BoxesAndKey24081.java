package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BoxesAndKey24081 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> set = new HashSet<>();
		br.readLine();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, res = 0;
		
		while (st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = 0; i < str.split(" ").length; i++) {
			v = Integer.parseInt(str.split(" ")[i]);
			res = set.contains(v) ? res + 1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
