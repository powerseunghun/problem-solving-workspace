package Goorm.AlgorithmHeroes.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakdownComputer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]), idx = 0, count = 1;
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			arr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i-1] > c) {
				count = 1;
			}
			else count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
