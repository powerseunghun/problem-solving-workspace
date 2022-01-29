package Acmicpc.OrderSubmit.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Guitarlist1495 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);
		int M = Integer.parseInt(tmp.split(" ")[2]);
		int[] arr = new int[N+1], vol = new int[M+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.fill(vol, -1);
		vol[S] = 0;
		
		for (int i = 1; i < arr.length; i++) {
			list.clear();
			for (int j = 0; j < vol.length; j++) {
				if (vol[j] == i-1) {
					if (j - arr[i] >= 0 && j - arr[i] <= M) {
						list.add(j-arr[i]);
					}
					if (j + arr[i] >= 0 && j + arr[i] <= M) {
						list.add(j+arr[i]);
					}
				}
			}
			for (int j = 0; j < list.size(); j++) {
				vol[list.get(j)] = i;
			}
		}
		for (int i = M; i >= 0; i--) {
			if (vol[i] == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
		
	}
}
