package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bf {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), diff = Integer.MIN_VALUE;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1, val = 0; k < arr.length; k++) {
					val = arr[i] + arr[j] + arr[k];
					if (val <= M && val > diff) {
						System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
						diff = val;
					}
				}
			}
		}
		System.out.println(diff);
		
	}
}
