package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Stone {
	private int area;
	private int height;
	private int weight;
	
	public Stone() {
		this.area = 0;
		this.height = 0;
		this.weight = 0;
	}
	public Stone(int a, int h, int w) {
		this.area = a;
		this.height = h;
		this.weight = w;
	}
	public int getArea() {
		return this.area;
	}
	public void setArea(int a) {
		this.area = a;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int w) {
		this.weight = w;
	}
}
public class MakeHighestStoneTower4446 {
	static Stone[] stones = null;
	static boolean[] check = null;
	static int[] arr = null;
	static int maxCount = 0;
	static void bt(int n, int d, int c) {
		if (d >= n) {
//			maxCount check
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
//			System.out.println("n == d");
			maxCount = maxCount >= c ? maxCount : c;
			return;
		}
		
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (d == 0) {
				if (!check[i]) {
					check[i] = true;
					flag = true;
					arr[d] = i+1;
					bt(n, d+1, c+1);
					check[i] = false;
				}
			}
			else {
				if (!check[i]) {
					if (stones[arr[d-1]-1].getArea() > stones[i].getArea() && stones[arr[d-1]-1].getWeight() > stones[i].getWeight()) {
						check[i] = true;
						flag = true;
						arr[d] = i+1;
						bt(n, d+1, c+1);
						check[i] = false;
					}
				}
			}
		}
		if (!flag) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("flag false");
			maxCount = maxCount >= c ? maxCount : c;
			return;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		stones = new Stone[n];
		check = new boolean[n];
		Arrays.fill(check, false);
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			stones[i] = new Stone(a, h, w);
		}
		bt(n, 0, 0);
		System.out.println(maxCount);
	}
}
