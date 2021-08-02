package Acmicpc.DataStructure.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class SymmetricDifference1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> A = new HashMap<>();
		Map<Integer, Integer> B = new HashMap<>();
		StringTokenizer st = null;
		int countA = 0, countB = 0;
		br.readLine();
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if (i == 0) {
					A.put(Integer.parseInt(st.nextToken()), 1);
				}
				else B.put(Integer.parseInt(st.nextToken()), 1);
			}
		}
		Object[] aKeys = A.keySet().toArray();
		Object[] bKeys = B.keySet().toArray();
		for (int i = 0; i < aKeys.length; i++) {
			if (!B.containsKey((int)aKeys[i])) countA++; 
		}
		for (int i = 0; i < bKeys.length; i++) {
			if (!A.containsKey((int)bKeys[i])) countB++;
		}
		
		System.out.println(countA + countB);
	}
}
