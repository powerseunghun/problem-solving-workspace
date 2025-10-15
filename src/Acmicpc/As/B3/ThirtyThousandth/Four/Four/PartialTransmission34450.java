package Acmicpc.As.B3.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class PartialTransmission34450 {
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = p; i < p+n; i++) {
			if (!set.contains(i)) {
				res = i;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
