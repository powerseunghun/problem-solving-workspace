package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IterationPrint1351 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int e = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = s; i <= e; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}
