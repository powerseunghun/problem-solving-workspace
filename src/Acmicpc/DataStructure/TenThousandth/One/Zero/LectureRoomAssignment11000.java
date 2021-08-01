package Acmicpc.DataStructure.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

class Lecture implements Comparable<Lecture> {
	private int s;
	private int t;
	public Lecture() {
		this.s = 0;
		this.t = 0;
	}
	public Lecture(int s, int t) {
		this.s = s;
		this.t = t;
	}
	
	public int getS() {
		return this.s;
	}
	public int getT() {
		return this.t;
	}
	@Override
	public int compareTo(Lecture o) {
		return this.getS() - o.getS();
	}
}
public class LectureRoomAssignment11000 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<>();
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), s = 0, t = 0;
		Lecture[] lecs = new Lecture[N];
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			t = Integer.parseInt(tmp.split(" ")[1]);
			lecs[i] = new Lecture(s, t);
		}
		Arrays.sort(lecs);
		q.add(lecs[0].getT());
		for (int i = 1; i < lecs.length; i++) {
			if (q.peek() <= lecs[i].getS()) {
				q.poll();
				q.add(lecs[i].getT());
			}
			else q.add(lecs[i].getT());
		}
		System.out.println(q.size());
	}
}
