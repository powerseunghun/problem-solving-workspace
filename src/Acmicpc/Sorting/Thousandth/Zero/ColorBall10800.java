package Acmicpc.Sorting.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Ball implements Comparable<Ball> {
	private int number;
	private int color;
	private int size;
	public Ball(int n, int c, int s) {
		this.number = n;
		this.color = c;
		this.size = s;
	}
	public int getNumber() {
		return this.number;
	}
	public int getColor() {
		return this.color;
	}
	public int getSize() {
		return this.size;
	}
	@Override
	public int compareTo(Ball o) {
		if (this.getSize() == o.getSize()) {
			return this.getColor() - o.getColor();
		}
		else return this.getSize() - o.getSize();
	}
}
public class ColorBall10800 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), sum = 0;
		Ball[] bs = new Ball[N];
		int[] score = new int[N], cArr = new int[N+1];
		
		for (int i = 0, c = 0, s = 0; i < bs.length; i++) {
			tmp = br.readLine();
			c = Integer.parseInt(tmp.split(" ")[0]);
			s = Integer.parseInt(tmp.split(" ")[1]);
			bs[i] = new Ball(i+1, c, s);
		}
		Arrays.sort(bs);
		for (int i = 0, j = 0; i < bs.length; i++) {
			Ball b1 = bs[i];
			Ball b2 = bs[j];
			
			while (b2.getSize() < b1.getSize()) {
				sum += b2.getSize();
				cArr[b2.getColor()] += b2.getSize();
				b2 = bs[j+=1];
			}
			score[b1.getNumber()-1] = sum - cArr[b1.getColor()];
		}
		
		for (int el : score) sb.append(el + "\n");
		System.out.print(sb.toString());
	}
}
