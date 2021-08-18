package Acmicpc.Sorting.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MathHomeWork2870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		ArrayList<BigInteger> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine().replaceAll("[a-z]", " "));
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				if (tmp.equals("")) continue;
				list.add(new BigInteger(tmp));
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
