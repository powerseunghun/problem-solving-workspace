package Codeforce.OrderSubmit.OneThousandth.OneHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoungPhysicist {
	static int[][] arr = null;
	static boolean check() {
		for (int i = 0, sum = 0; i < arr[0].length; i++, sum = 0) {
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			if (sum != 0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][3];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(check()? "YES" : "NO");
		br.close();
	}
}
