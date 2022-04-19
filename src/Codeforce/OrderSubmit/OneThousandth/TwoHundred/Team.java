package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Team {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), res = 0;
		int[][] arr = new int[N][3];
		
		for (int i = 0, count = 0; i < arr.length; i++, count = 0) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				count += arr[i][j] == 1 ? 1 : 0;
			}
			res += count >= 2 ? 1 : 0;
		}
		
		System.out.println(res);
		br.close();
	}
}
