package Acmicpc.GreedyAlgorithm.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci9009 {
	static void fiboInit(long[] fibo) {
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> list = new ArrayList<>();
		//fibo 45 = 1134903170;
		long[] fibo = new long[46];
		fiboInit(fibo);
		int T = Integer.parseInt(br.readLine()), N = 0;
		int left = 0, right = 0, mid = 0;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			list.clear();
			while (N != 0) {
				left = 0;
				right = fibo.length-1;
				while (left <= right) {
					mid = (left+right)/2;
					if (fibo[mid] > N) right = mid-1;
					else left = mid+1;
				}
				N -= fibo[right];
				list.add(fibo[right]);
			}
			Collections.sort(list);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}
}
