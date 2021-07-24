package Acmicpc.Implements.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Loc {
	private int x;
	private int y;
	
	public Loc() {
		this.x = 0;
		this.y = 0;
	}
	public Loc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return this.y;
	}
}
public class ChickenStreet15686 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static Loc[] chickenList = null;
	static Map<String, Integer> map = new HashMap<>();
	static ArrayList<Loc> choiceChicken = new ArrayList<>();
	static int min = Integer.MAX_VALUE;
	static int sum = 0, distSumMin = Integer.MAX_VALUE;
	static void choiceChicken(int n, int d, int x, int y) {
		if (d >= n) {
			sum = 0;
			choiceChicken.clear();
			for (int i = 0; i < chickenList.length; i++) {
				choiceChicken.add(new Loc(chickenList[i].getX(), chickenList[i].getY()));
			}
			for (int i = 1; i < arr.length-1; i++) {
				for (int j = 1; j < arr.length-1; j++) {
					if (arr[i][j] == 1) {
						min = Integer.MAX_VALUE;
						for (int k = 0; k < choiceChicken.size(); k++) {
							Loc tmp = choiceChicken.get(k);
							int dist = Math.abs(i-tmp.getX()) + Math.abs(j-tmp.getY());
							min = Math.min(dist, min);
						}
						sum += min;
					}
				}
			}
			distSumMin = Math.min(distSumMin, sum);
			return;
		}
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length-1; j++) {
				if (arr[i][j] == 2 && !check[i][j]) {
					chickenList[d] = new Loc(i, j);
					check[i][j] = true;
					choiceChicken(n, d+1, i, j);
					check[i][j] = false;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N+2][N+2];
		check = new boolean[N+2][N+2];
		chickenList = new Loc[M];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		choiceChicken(M, 0, 1, 1);
		System.out.println(distSumMin);
	}
}
