package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplements {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char com = ' ';
		Queue q = new LinkedList<>();
		
		for (int i = 0, val = 0; i < N; i++) {
			com = br.readLine().charAt(0);
			switch(com) {
			case 'e': case 'E':
				val = Integer.parseInt(br.readLine());
				if (q.size() >= N) {
					System.out.println("overflow");
				}
				else q.add(val);
				break;
			case 'd': case 'D':
				if (q.size() == 0) {
					System.out.println("underflow");
				}
				else q.poll();
				break;
			default:
				i = N;
				break;
			}
		}
		while (!q.isEmpty()) {
			System.out.print(q.poll());
			if (q.size() != 0) {
				System.out.print(" ");
			}
		}
		br.close();
		
//		List<Integer> q = new ArrayList<>();
//		
//		for (int i = 0, val = 0; i < N; i++) {
//			com = br.readLine().charAt(0);
//			switch(com) {
//			case 'e':
//				val = Integer.parseInt(br.readLine());
//				if (q.size() > N) {
//					System.out.println("overflow");
//				}
//				else q.add(val);
//				break;
//			case 'd':
//				if (q.size() == 0) {
//					System.out.println("underflow");
//				}
//				else q.remove(q.size()-1);
//				break;
//			default:
//				i = N;
//				break;
//			}
//		}
//		for (int i = 0; i < q.size(); i++) {
//			System.out.print(q.get(i));
//			if (i != q.size()-1) System.out.print(" ");
//		}
//		br.close();
	}
}
