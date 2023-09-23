package Acmicpc.As.B1.TenThousandth.Eight.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class JumpJump18512 {
	static final int limit = 1000;
	static Set<Integer> checkA = new HashSet<Integer>();
	static Set<Integer> checkB = new HashSet<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int X = Integer.parseInt(str.split(" ")[0]);
		int Y = Integer.parseInt(str.split(" ")[1]);
		int P1 = Integer.parseInt(str.split(" ")[2]);
		int P2 = Integer.parseInt(str.split(" ")[3]), t = 1, res = Integer.MAX_VALUE;
		int nextA = P1, nextB = P2;
		
		checkA.add(P1);
		checkB.add(P2);
		while (t++ < limit) {
			nextA += X;
			nextB += Y;
			checkA.add(nextA);
			checkB.add(nextB);
			
			if (checkA.contains(nextB) || checkB.contains(nextA)) {
				res = Math.min(nextA, nextB);
				break;
			}
		}
		
		System.out.println(res == Integer.MAX_VALUE ? "-1" : res);
		br.close();
	}
}
