package Acmicpc.As.B2.TwentyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SeoKangHistory25177 {
	static List<Integer> A = new ArrayList<>();
	static List<Integer> B = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int max = 0, exAdd = 0;
		StringTokenizer st = null;
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if (i == 0) {
					A.add(Integer.parseInt(st.nextToken()));
				}
				else B.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		exAdd = Math.max(A.size(), B.size()) - A.size();
		for (int i = 0; i < exAdd; i++) {
			A.add(0);
		}
		exAdd = Math.max(A.size(), B.size()) - B.size();
		for (int i = 0; i < exAdd; i++) {
			B.add(0);
		}
		
		for (int i = 0; i < Math.max(A.size(), B.size()); i++) {
			max = Math.max(max, B.get(i)-A.get(i));
		}
		
		System.out.println(max);
		br.close();
	}
}
