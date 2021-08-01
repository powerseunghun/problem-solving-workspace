package Acmicpc.DataStructure.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Airport10775 {
	static int[] seat = null;
	static int find(int s) {
		if (s == seat[s]) {
			return s;
		}
		else return seat[s] = find(seat[s]);
	}
	static void union(int x, int y) {
		if (find(x) != find(y)) seat[x] = y;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		int g = 0, count = 0;
		
		seat = new int[N+1];
		for (int i = 1; i < seat.length; i++) {
			seat[i] = i;
		}
		
		for (int i = 0, gate = 0; i < P; i++) {
			g = Integer.parseInt(br.readLine());
			gate = find(g);
			if (gate == 0) {
				break;
			}
			count++;
			union(gate, gate-1);
		}
		System.out.println(count);
	}
}
