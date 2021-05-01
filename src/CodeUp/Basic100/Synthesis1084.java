package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Synthesis1084 {
	// to fix
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int r = Integer.parseInt(tmp.split(" ")[0]);
		int g = Integer.parseInt(tmp.split(" ")[1]);
		int b = Integer.parseInt(tmp.split(" ")[2]);
		int sum = 0;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int k = 0; k < b; k++) {
					sb.append(i + " " + j + " " + k + "\n");
					sum++;
				}
			}
		}
		System.out.println(sb);
		System.out.println(sum);
	}
}
