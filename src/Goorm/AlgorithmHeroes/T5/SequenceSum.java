package Goorm.AlgorithmHeroes.T5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequenceSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]), s = 0, e = 0;
		int[] arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i] += arr[i-1];
		}
		tmp = br.readLine();
		s = Integer.parseInt(tmp.split(" ")[0]);
		e = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(arr[e]-arr[s-1]);
		br.close();
	}
}
