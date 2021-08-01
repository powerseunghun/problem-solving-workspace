package Acmicpc.DataStructure.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Ballon {
	private int n;
	private int c;
	
	public Ballon() {
		this.n = 0;
		this.c = 0;
	}
	public Ballon(int n, int c) {
		this.n = n;
		this.c = c;
	}
	public int getN() {
		return this.n;
	}
	public int getC() {
		return this.c;
	}
}
public class Ballon2346 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Ballon> dq = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine()), command = 0;
		Ballon tmp = null;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			dq.add(new Ballon(i, Integer.parseInt(st.nextToken())));
		}
		
		tmp = dq.pollFirst();
		command = tmp.getC();
		sb.append(tmp.getN() + " ");
		
		while (!dq.isEmpty()) {
			if (command > 0) {
				for (int i = 0; i < command; i++) {
					dq.addLast(dq.pollFirst());
				}
				tmp = dq.pollLast();
			}
			else {
				for (int i = 0; i < Math.abs(command); i++) {
					dq.addFirst(dq.pollLast());
				}
				tmp = dq.pollFirst();
			}
			sb.append(tmp.getN() + " ");
			command = tmp.getC();
		}
		System.out.println(sb.toString());
	}
}
