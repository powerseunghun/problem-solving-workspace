package Acmicpc.Step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class RotateQueue1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int count = 0;
		int[] arr = new int[M];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (q.peek() == arr[i]) {
				q.poll();
				continue;
			}
			
			int sIdx = 0, eIdx = q.size()-1;
			while (q.get(sIdx) != arr[i] && q.get(eIdx) != arr[i]) {
				sIdx++;
				eIdx--;
			}
			
			count += q.get(sIdx) == arr[i] ? sIdx : (q.size() - eIdx);
			if (q.get(sIdx) == arr[i]) {
				while (q.peek() != arr[i]) {
					q.addLast(q.pollFirst());
				}
			}
			else {
				while (q.peek() != arr[i]) {
					q.addFirst(q.pollLast());
				}
			}
			q.poll();
		}
		System.out.println(count);
	}
}
