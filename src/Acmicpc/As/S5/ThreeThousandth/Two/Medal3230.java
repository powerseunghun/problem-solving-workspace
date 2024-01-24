package Acmicpc.As.S5.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Medal3230 {
	static final int medalCnt = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		LinkedList<Integer> first = new LinkedList<Integer>();
		LinkedList<Integer> second = new LinkedList<Integer>();
		
		for (int i = 0, r = 0; i < N; i++) {
			r = Integer.parseInt(br.readLine())-1;
			first.add(r, i);
		}
		for (int i = M, r = 0; i > 0; i--) {
			r = Integer.parseInt(br.readLine())-1;
			second.add(r, first.get(i-1));
		}
		
		for (int i = 0; i < medalCnt; i++) {
			sb.append(second.get(i)+1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
