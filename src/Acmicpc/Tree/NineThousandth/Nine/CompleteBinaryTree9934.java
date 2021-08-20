package Acmicpc.Tree.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CompleteBinaryTree9934 {
	static int K = 0;
	static int[] arr = null;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static void f(int l, int r, int d) {
		if (d >= K) return;
		
		int mid = (l + r) / 2;
		list.get(d).add(arr[mid]);
		f(l, mid-1, d+1);
		f(mid+1, r, d+1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[(int)Math.pow(2, K)-1];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < K; i++) {
			list.add(new ArrayList<>());
		}
		f(0, arr.length-1, 0);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
