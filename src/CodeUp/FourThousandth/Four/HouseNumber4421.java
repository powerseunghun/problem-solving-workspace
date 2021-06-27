package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class HouseNumber4421 {
	static int[][] arr = null;
	static int count = 0;
	
	static void search(int i, int j, int value) {
		if (i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
			return;
		}
		if (arr[i][j] == 0) return;
		
		if (arr[i][j] == value) {
			arr[i][j] = 0;
			count++;
			search(i-1, j, value);
			search(i+1, j, value);
			search(i, j-1, value);
			search(i, j+1, value);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int[] counts = null;
		String tmp = null;
		arr = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt((tmp.charAt(j) - '0')+"");
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 0) {
					cnt++;
					count = 0;
					search(i, j, arr[i][j]);
					list.add(count);
				}
			}
		}
		
		System.out.println(cnt);
		counts = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			counts[i] = list.get(i);
		}
		Arrays.sort(counts);
		
		for (int el : counts) {
			System.out.println(el);
		}
		
	}
}
