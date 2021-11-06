package Goorm.AlgorithmHeroes.T3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnackTowerHeight {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean flag = true;
		
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), sum = 0, min = Integer.MAX_VALUE;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			min = Math.min(min, arr[i]);
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				flag = false;
				break;
			}
		}
		
		if (flag) System.out.println("0");
		else System.out.println((sum/(N-1)) - min);
		
		br.close();
	}
}
