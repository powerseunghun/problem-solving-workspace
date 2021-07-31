package Acmicpc.DataStructure.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Queue10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		String tmp = null, command = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0, val = 0; i < N; i++) {
			tmp = br.readLine();
			command = tmp.split(" ")[0];
			switch(command) {
			case "push":
				val = Integer.parseInt(tmp.split(" ")[1]);
				q.add(val);
				break;
			case "pop":
				if (q.isEmpty()) sb.append("-1\n");
				else sb.append(q.poll()+"\n");
				break;
			case "size":
				sb.append(q.size()+"\n");
				break;
			case "empty":
				if (q.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				break;
			case "front":
				if (q.isEmpty()) sb.append("-1\n");
				else sb.append(q.peekFirst()+"\n");
				break;
			case "back":
				if (q.isEmpty()) sb.append("-1\n");
				else sb.append(q.peekLast()+"\n");
				break;
			}
		}
		System.out.print(sb.toString());
	}
}
