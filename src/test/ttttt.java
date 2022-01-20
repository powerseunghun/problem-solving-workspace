package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ttttt {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int[] weight = new int[N], height = new int[N], rank = new int[N];
		
		for (int i = 0, w = 0, h = 0; i < height.length; i++) {
			tmp = br.readLine();
			w = Integer.parseInt(tmp.split(" ")[0]);
			h = Integer.parseInt(tmp.split(" ")[1]);
			weight[i] = w;
			height[i] = h;
		}
		
		for (int i = 0, val = 0; i < rank.length; i++) {
			val = 1;
			for (int j = 0; j < rank.length; j++) {
				if (i == j) continue;
				if (weight[i] < weight[j] && height[i] < height[j]) val++;
			}
			rank[i] = val;
		}
		
		for (int el :rank) {
			System.out.print(el + " ");
		}
		System.out.println();
		br.close();
	}
}
