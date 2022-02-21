package Acmicpc.OrderSubmit.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Firefly3020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), sum = 0;
		int H = Integer.parseInt(tmp.split(" ")[1]), res = N, count = 0;
		int[] stalagmite = new int[H+1], stalactite = new int[H+1];
		
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				stalagmite[Integer.parseInt(br.readLine())]++;
			}
			else stalactite[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i = 1; i < stalagmite.length; i++) {
			stalagmite[i] += stalagmite[i-1];
			stalactite[i] += stalactite[i-1];
		}
		
		for (int i = 1; i < stalagmite.length; i++) {
			sum = 0;
			sum += stalagmite[H] - stalagmite[i-1];
			sum += stalactite[H] - stalactite[H-i];
			
			if (res > sum) {
				res = sum;
				count = 1;
			}
			else if (res == sum) count++;
		}
		System.out.println(res + " " + count);
		br.close();
//		for (int el : stalagmite) {
//			System.out.println(el);
//		}
//		
//		System.out.println();
//		for (int el : stalactite) {
//			System.out.println(el);
//		}
	}
}
