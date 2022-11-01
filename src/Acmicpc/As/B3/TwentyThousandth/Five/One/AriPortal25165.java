package Acmicpc.As.B3.TwentyThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AriPortal25165 {
	static int[] info = new int[6];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		for (int i = 0; i < info.length; i+=2) {
			tmp = br.readLine();
			info[i] = Integer.parseInt(tmp.split(" ")[0]);
			info[i+1] = Integer.parseInt(tmp.split(" ")[1]);
		}
		int[][] arr = new int[info[0]][info[1]];
		boolean flag = false;
		arr[info[4]-1][info[5]-1] = 1;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (info[3] == 0) {
				for (int j = (i == 0 ? info[2]-1 : arr[0].length-1); j >= 0; j--) {
					if ((i == info[0]-1 && j == info[1]-1) || (arr[i][j] == 1)) {
						flag = arr[i][j] == 1 ? true : flag;
						i = arr.length;
						break;
					}
				}
			}
			else {
				for (int j = (i == 0 ? info[2]-1 : 0); j < arr[i].length; j++) {
					if ((i == info[0]-1 && j == info[1]-1) || (arr[i][j] == 1)) {
						flag = arr[i][j] == 1 ? true : flag;
						i = arr.length;
						break;
					}
				}
			}
			info[3] = info[3] == 0 ? 1 : 0;
		}
		
		System.out.println(flag ? "NO..." : "YES!");
		br.close();
	}
}
