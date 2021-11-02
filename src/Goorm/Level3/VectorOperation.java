package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VectorOperation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[] vector = new int[4];
		double res1 = 0, res2 = 0;
		
		for (int i = 0; i < 4; i+=2) {
			tmp = br.readLine();
			vector[i] = Integer.parseInt(tmp.split(" ")[0]);
			vector[i+1] = Integer.parseInt(tmp.split(" ")[1]);
		}
		tmp = br.readLine();
		
		res1 = tmp.equals("+") ? vector[0] + vector[2] : vector[0] - vector[2];
		res2 = tmp.equals("+") ? vector[1] + vector[3] : vector[1] - vector[3];
		
		System.out.printf("%.2f %.2f\n", res1, res2);
	}
}
