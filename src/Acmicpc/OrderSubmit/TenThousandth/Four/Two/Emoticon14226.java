package Acmicpc.OrderSubmit.TenThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Info {
	private int display;
	private int clipboard;
	private int time;
	
	public Info(int d, int c, int t) {
		this.display = d;
		this.clipboard = c;
		this.time = t;
	}
	public int getDisplay() {
		return display;
	}
	public void setDisplay(int display) {
		this.display = display;
	}
	public int getClipboard() {
		return clipboard;
	}
	public void setClipboard(int clipboard) {
		this.clipboard = clipboard;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
public class Emoticon14226 {
	static boolean[][] check = new boolean[1001][1001];
	static int bfs(int S) {
		Queue<Info> q = new LinkedList<>();
		check[1][0] = true;
		int time = Integer.MAX_VALUE;
		q.add(new Info(1, 0, 0));
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			if (tmp.getDisplay() == S) {
				time = Math.min(time, tmp.getTime());
				break;
			}
			if (tmp.getDisplay() > 0 && tmp.getDisplay() <= 1000) {
				if (!check[tmp.getDisplay()][tmp.getDisplay()]) {
					check[tmp.getDisplay()][tmp.getDisplay()] = true;
					q.add(new Info(tmp.getDisplay(), tmp.getDisplay(), tmp.getTime()+1));
				}
				
				if (tmp.getClipboard() > 0 && tmp.getClipboard() + tmp.getDisplay() <= 1000) {
					if (!check[tmp.getDisplay()+tmp.getClipboard()][tmp.getClipboard()]) {
						check[tmp.getDisplay()+tmp.getClipboard()][tmp.getClipboard()] = true;
						q.add(new Info(tmp.getDisplay()+tmp.getClipboard(), tmp.getClipboard(), tmp.getTime()+1));
					}
				}
				if (!check[tmp.getDisplay()-1][tmp.getClipboard()]) {
					check[tmp.getDisplay()-1][tmp.getClipboard()] = true;
					q.add(new Info(tmp.getDisplay()-1, tmp.getClipboard(), tmp.getTime()+1));
				}
			}
		}
		
		return time;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		
		System.out.println(bfs(S));
		br.close();
	}
}
