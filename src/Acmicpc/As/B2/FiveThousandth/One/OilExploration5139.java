package Acmicpc.As.B2.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OilExploration5139 {
	static char[][] arr = null;
	static int[] costs = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), w = 0, h = 0, cost = 0;
		boolean flag = false;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			w = Integer.parseInt(tmp.split(" ")[0]);
			h = Integer.parseInt(tmp.split(" ")[1]);
			arr = new char[w][h];
			costs = new int[h];
			
			for (int j = 0; j < w; j++) {
				tmp = br.readLine();
				for (int k = 0; k < tmp.length(); k++) {
					arr[j][k] = tmp.charAt(k);
				}
			}
			
			sb.append("Data Set ").append(i).append(":").append("\n");
			for (int j = 0; j < arr[0].length; j++) {
				cost = 0;
				flag = false;
				for (int k = 0; k < arr.length; k++) {
					if (arr[k][j] == 'X') {
						flag = true;
						break;
					}
					cost += arr[k][j] == 'H' ? 3 : 1;
				}
				sb.append(flag ? cost : "N").append(" ");
			}
			sb.append("\n\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
