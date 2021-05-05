package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagPrint1370 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int h = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int j = 0; j < h-1; j++) {
				for (int k = h-1; k > j+1; k--) {
					System.out.print(" ");
				}
				System.out.println("*"); 
			}
		}
	}
}
