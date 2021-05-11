package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaperCutting1677 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == m-1) {
					if (j == 0 || j == n-1) System.out.print("+");
					else System.out.print("-");
				}
				else {
					if (j == 0 || j == n-1) System.out.print("|");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
