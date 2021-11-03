package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Docu implements Comparable<Docu>{
	private int number;
	private int time;
	private int paper;
	
	public Docu() {
		this.number = 0;
		this.time = 0;
		this.paper = 0;
	}
	
	public Docu(int n, int t, int p) {
		this.number = n;
		this.time = t;
		this.paper = p;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPaper() {
		return paper;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}

	@Override
	public int compareTo(Docu o) {
		return this.time - o.getTime();
	}
}
public class P2 {
	public static void main(String[] args) {
//		int[][] data = {{1, 0, 5},{2, 2, 2},{3, 3, 1},{4, 4, 1},{5, 10, 2}};
//		int[][] data = {{1, 0, 3},{2, 1, 3},{3, 3, 2},{4, 9, 1},{5, 10, 2}};
		int[][] data = {{1, 2, 10},{2, 5, 8},{3, 6, 9},{4, 20, 6},{5, 25, 5}};
		StringBuilder sb = new StringBuilder();
		List<Docu> list = new ArrayList<>();
		Queue<Docu> q = new LinkedList<>();
		PriorityQueue<Docu> pq = new PriorityQueue<>(new Comparator<Docu>() {
			@Override
			public int compare(Docu o1, Docu o2) {
				return o1.getPaper()-o2.getPaper();
			}
		});
		int idx = 0;
		long time = 0;
		
		for (int i = 0; i < data.length; i++) {
			list.add(new Docu(data[i][0], data[i][1], data[i][2]));
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNumber() + ", " + list.get(i).getTime() + ", " + list.get(i).getPaper());
		}
		
		while (q.size() != data.length) {
			if (pq.isEmpty()) {
				pq.add(list.get(idx++));
				continue;
			}
			
			while (idx < list.size() && list.get(idx).getTime() <= time) {
				pq.add(list.get(idx++));
			}
			
			Docu d = pq.poll();
			q.add(d);
			time += d.getPaper();
			
			// 처음 출력 시간
			if (q.size() == 1) time += d.getTime();
		}
		
//		for (int i = 0; i < answer.length; i++) {
//            Docu t = q.poll();
//            answer[i] = t.getNumber();
//        }
		while (!q.isEmpty()) {
			Docu t = q.poll();
			sb.append(t.getNumber() + " ");
		}

		System.out.println(sb.toString());
	}
}
