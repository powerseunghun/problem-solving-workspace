package Acmicpc.OrderSubmit.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Info implements Comparable<Info>{
	private int x;
	private int y;
	
	public Info(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int compareTo(Info o) {
		if (this.getY() == o.getY()) {
			return this.getX()-o.getX();
		}
		else return this.getY() - o.getY();
	}
}
public class HandOutBook9576 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, count = 0;
		boolean[] check = null;
		Info[] list = null;
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			
			list = new Info[M];
			check = new boolean[N];
			count = 0;
			list[0] = new Info(Integer.MIN_VALUE, Integer.MIN_VALUE);
			for (int j = 0, x = 0, y = 0; j < M; j++) {
				tmp = br.readLine();
				x = Integer.parseInt(tmp.split(" ")[0]);
				y = Integer.parseInt(tmp.split(" ")[1]);
				list[j] = new Info(x-1, y-1);
			}
			
			Arrays.sort(list);
			for (int j = 0, x = 0, y = 0; j < M; j++) {
				x = list[j].getX();
				y = list[j].getY();
				
				for (int k = x; k <= y; k++) {
					if (check[k]) continue;
					check[k] = true;
					count++;
					break;
				}
			}
			sb.append(count + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
