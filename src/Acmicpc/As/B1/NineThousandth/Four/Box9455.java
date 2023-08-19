package Acmicpc.As.B1.NineThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Box9455 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, res = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			arr = new int[N][M];
			
			for (int i = 0; i < arr.length; i++) {
				str = br.readLine();
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(str.split(" ")[j]);
				}
			}
			res = 0;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == 1) {
						for (int k = i+1; k < arr.length; k++) {
							if (arr[k][j] == 0) {
								res++;
							}
                        }
					}
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
