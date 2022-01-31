package Acmicpc.OrderSubmit.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Info {
	private int pos;
	private int jump;
	private int time;
	
	public Info(int p, int j, int t) {
		this.pos = p;
		this.jump = j;
		this.time = t;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getJump() {
		return jump;
	}
	public void setJump(int jump) {
		this.jump = jump;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
public class JumpJump11060 {
	static int min = Integer.MAX_VALUE;
	static int[] check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Info> q = new LinkedList<>();
		int[] arr = new int[N];
		check = new int[N];
		Arrays.fill(check, Integer.MAX_VALUE);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		q.add(new Info(0, arr[0], 0));
		check[0] = 0;
		
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			if (tmp.getPos() == N-1) {
				min = Math.min(min, tmp.getPos()); 
			}
			
			for (int i = 1, nx = 0; i <= tmp.getJump(); i++) {
				nx = tmp.getPos() + i;
				if (nx < 0 || nx > N-1) continue;
				if (check[nx] > tmp.getTime()+1) {
					check[nx] = tmp.getTime()+1;
					q.add(new Info(nx, arr[nx], tmp.getTime()+1));
				}
			}
		}
		
		System.out.println(check[N-1] == Integer.MAX_VALUE ? -1 : check[N-1]);
		br.close();
	}
}
