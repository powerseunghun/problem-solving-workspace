package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroundAreaComparison1289 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int max = Integer.parseInt(tmp.split(" ")[0]) * Integer.parseInt(tmp.split(" ")[1]);
		int ar = 0;
		
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			ar = Integer.parseInt(tmp.split(" ")[0]) * Integer.parseInt(tmp.split(" ")[1]);
			max = ar >= max ? ar : max;
		}
		
		System.out.println(max);
	}
}
