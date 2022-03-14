package Acmicpc.OrderSubmit.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Info {
	private int dep;
	private int time;
	
	public Info (int d, int t) {
		this.dep = d;
		this.time = t;
	}
	public int getDep() {
		return dep;
	}
	public void setDep(int dep) {
		this.dep = dep;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
public class Hacking10282 {
	static int infectionCount = 0, max = 0;
	static List<Info>[] list = null;
	static int[] dist = null;
	static void init() {
		Arrays.fill(dist, Integer.MAX_VALUE);
		for (int j = 0; j < list.length; j++) {
			list[j] = new ArrayList<>();
		}
		infectionCount = 0;
		max = 0;
	}
	static void dijkstra(int c) {
		PriorityQueue<Info> pq = new PriorityQueue<>((o1, o2) -> {return o1.getDep()-o2.getDep();});
		pq.add(new Info(c, 0));
		
		while (!pq.isEmpty()) {
			Info cur = pq.poll();
			if (dist[cur.getDep()] < cur.getTime()) continue;
			
			for (int i = 0; i < list[cur.getDep()].size(); i++) {
				int nextDep = list[cur.getDep()].get(i).getDep();
				int nextTime = list[cur.getDep()].get(i).getTime() + cur.getTime();
				if (dist[nextDep] > nextTime) {
					dist[nextDep] = nextTime;
					pq.add(new Info(nextDep, nextTime));
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 0, n = 0, d = 0, c = 0; i < T; i++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			list = new ArrayList[n+1];
			dist = new int[n+1];
			
			init();
			for (int j = 0, a = 0, b = 0, s = 0; j < d; j++) {
				tmp = br.readLine();
				a = Integer.parseInt(tmp.split(" ")[0]);
				b = Integer.parseInt(tmp.split(" ")[1]);
				s = Integer.parseInt(tmp.split(" ")[2]);
				list[b].add(new Info(a, s));
			}
			dijkstra(c);
			dist[c] = 0;
			for (int j = 1; j < dist.length; j++) {
                if (dist[j] != Integer.MAX_VALUE) {
                    infectionCount++;
                    max = Math.max(max, dist[j]);
                }
            }
			sb.append(infectionCount + " " + max + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}