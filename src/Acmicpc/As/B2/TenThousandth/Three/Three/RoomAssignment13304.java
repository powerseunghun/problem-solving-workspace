package Acmicpc.As.B2.TenThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomAssignment13304 {
	static int[][] arr = new int[2][7];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		while (N-- > 0) {
			str = br.readLine();
			arr[Integer.parseInt(str.split(" ")[0])][Integer.parseInt(str.split(" ")[1])]++;
		}
		res += (arr[0][1]+arr[1][1]+arr[0][2]+arr[1][2]+K-1)/K;
		res += (arr[0][3]+arr[0][4]+K-1)/K;
		res += (arr[1][3]+arr[1][4]+K-1)/K;
		res += (arr[0][5]+arr[0][6]+K-1)/K;
		res += (arr[1][5]+arr[1][6]+K-1)/K;
		
		System.out.println(res);
		br.close();
	}
}
