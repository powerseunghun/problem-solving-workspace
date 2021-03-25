package Acmicpc.Step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String[] order = new String[2];
		int N = Integer.parseInt(br.readLine()), value = 0;
		Deque<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			order = br.readLine().split(" ");
			switch(order[0]) {
			case "push":
				q.offerFirst(Integer.parseInt(order[1]));
				break;
			case "pop":
				if (!q.isEmpty()) {
					sb.append(q.pollLast() + "\n");
				}
				else {
					sb.append("-1\n");
				}
				break;
			case "front":
				if (!q.isEmpty()) {
					sb.append(q.peekLast() + "\n");
				}
				else {
					sb.append("-1\n");
				}
				break;
			case "back":
				if (!q.isEmpty()) {
					sb.append(q.peekFirst() + "\n");
				}
				else {
					sb.append("-1\n");
				}
				break;
			case "empty":
				if (!q.isEmpty()) {
					sb.append("0\n");
				}
				else {
					sb.append("1\n");
				}
				break;
			case "size":
				sb.append(q.size() + "\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
