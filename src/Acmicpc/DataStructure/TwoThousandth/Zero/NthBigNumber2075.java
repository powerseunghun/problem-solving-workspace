package Acmicpc.DataStructure.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NthBigNumber2075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine()), ans = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
		}
		for (int i = 0; i < N; i++) {
			ans = q.poll();
		}
		
		System.out.println(ans);
	}
}
