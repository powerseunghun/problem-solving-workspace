package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class STLQueue3103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		
		String str = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			if (str.contains("push")) {
				str = str.replaceAll("[a-z]|_| |\\(|\\)", "");
				q.add(Integer.parseInt(str));
			}
			else if (str.contains("front")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				}
				else System.out.println(q.peekFirst());
			}
			else if (str.contains("back")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				}
				else System.out.println(q.peekLast());
			}
			else if (str.contains("pop")) {
				if (!q.isEmpty()) q.poll();
			}
			else if (str.contains("size")) {
				System.out.println(q.size());
			}
			else if (str.contains("empty")) {
				if (q.isEmpty()) {
					System.out.println("true");
				}
				else System.out.println("false");
			}
		}
		
	}
}
