package Acmicpc.OrderSubmit.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class BinarySearchTree2957_2 {
	static long count = 0;
	static TreeSet<Integer> ts = new TreeSet<>();
	static int[] d = null;
	static void init(int N) {
		d = new int[N+2];
		d[0] = -1;
		d[N+1] = -1;
		ts.add(0);
		ts.add(N+1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), X = 0;
		init(N);
		
		for (int i = 0; i < N; i++) {
			X = Integer.parseInt(br.readLine());
			d[X] = Math.max(d[ts.lower(X)], d[ts.higher(X)])+1;
			ts.add(X);
			count += d[X];
			sb.append(count + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
