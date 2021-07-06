package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bulk4772 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		int[][] arr = new int[n][3];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			arr[i][0] = Integer.parseInt(tmp.split(" ")[0]);
			arr[i][1] = Integer.parseInt(tmp.split(" ")[1]);
			arr[i][2] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				if (arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
					arr[i][2]++;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j][2] + " ");
		}
	}
}
