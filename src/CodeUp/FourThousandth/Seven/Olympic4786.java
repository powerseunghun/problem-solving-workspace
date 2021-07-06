package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Olympic4786 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		int[][] arr = new int[n][4];
		
		for (int i = 0, nat = 0; i < arr.length; i++) {
			tmp = br.readLine();
			nat = Integer.parseInt(tmp.split(" ")[0]);
			arr[nat-1][0] = Integer.parseInt(tmp.split(" ")[1]);
			arr[nat-1][1] = Integer.parseInt(tmp.split(" ")[2]);
			arr[nat-1][2] = Integer.parseInt(tmp.split(" ")[3]);
			arr[nat-1][3] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) continue;
				if (arr[j][0] > arr[i][0]) {
					arr[i][3]++;
					continue;
				}
				else if(arr[j][0] == arr[i][0]) {
					if (arr[j][1] > arr[i][1]) {
						arr[i][3]++;
						continue;
					}
					else if (arr[j][1] == arr[i][1]) {
						if (arr[j][2] > arr[i][2]) {
							arr[i][3]++;
							continue;
						}
					}
				}
			}
		}
		System.out.println(arr[K-1][3]);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
