package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LaddarGame2033 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String tmp = br.readLine();
		int k = Integer.parseInt(tmp.split(" ")[0]);
		int n = Integer.parseInt(tmp.split(" ")[1]), j = 0;
		int ladder[][] = new int[n + 2][k + 2];
		
		for (int i = 1; i <= n; i++) {
			tmp = br.readLine();
			ladder[i][Integer.parseInt(tmp.split(" ")[0])] = 1;
			ladder[i][Integer.parseInt(tmp.split(" ")[1])] = 1;
		}
		j = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			if (ladder[i][j] == 1) {
				j = ladder[i][j-1] == 1 ? j - 1 : j + 1;
			}
		}
		
		System.out.println(j);
	}
}
