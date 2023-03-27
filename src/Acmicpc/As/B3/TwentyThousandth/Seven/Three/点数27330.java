package Acmicpc.As.B3.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 点数27330 {
	static int[] arr = null;
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), res = 0;
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.readLine();
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int el : arr) {
			res += el;
			res = set.contains(res) ? 0 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
