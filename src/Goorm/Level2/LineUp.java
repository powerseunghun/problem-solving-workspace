package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class LineUp {
	static int[] arr = null;
	static void arrInit() {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	static boolean validArr(int N) {
		Set<Integer> check = new HashSet<>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] > N) return false;
			if (check.contains(arr[i])) return false;
			check.add(arr[i]);
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N+1];
		arrInit();
		
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			arr[a]++;
			arr[b]--;
		}
		if (validArr(N)) {
			for (int i = 1; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
		}
		else sb.append("-1");
		System.out.println(sb.toString());
	}
}
