package Acmicpc.As.B4.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ЗЛАТНАТАСРЕДА31281 {
	static final int l = 3;
	static List<BigInteger> list = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			list.add(new BigInteger(st.nextToken()));
		}
		Collections.sort(list);
		
		System.out.println(list.get(l/2));
		br.close();
	}
}
