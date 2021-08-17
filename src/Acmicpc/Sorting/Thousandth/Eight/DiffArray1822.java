package Acmicpc.Sorting.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DiffArray1822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int na = Integer.parseInt(tmp.split(" ")[0]);
		int nb = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		int[] A = new int[na], B = new int[nb];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B.length; i++) {
			B[i] = Integer.parseInt(st.nextToken());
			if (!map.containsKey(B[i])) map.put(B[i], 1);
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) continue;
			sb.append(A[i] + " ");
			count++;
		}
		System.out.println(count);
		
		if (count != 0) System.out.println(sb.toString());
		
	}
}
