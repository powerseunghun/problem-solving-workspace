package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int w = Integer.parseInt(tmp.split(" ")[0]);
		int h = Integer.parseInt(tmp.split(" ")[1]);
		int n = Integer.parseInt(tmp.split(" ")[2]);
		String[] strs = new String[n];
		
		for (int i = 0; i < n; i++) {
			strs[i] = br.readLine();
		}
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < strs[i].length(); k++) {
					for (int l = 0; l < w; l++) {
						System.out.print(strs[i].charAt(k));
					}
				}
				System.out.println();
			}
		}
		
	}
}
