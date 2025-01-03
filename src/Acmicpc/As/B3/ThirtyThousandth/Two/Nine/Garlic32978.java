package Acmicpc.As.B3.ThirtyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Garlic32978 {
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			set.add(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			set.remove(st.nextToken());
		}
		
		System.out.println(set.iterator().next());
		br.close();
	}
}
