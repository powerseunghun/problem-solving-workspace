package Goorm.AlgorithmHeroes.T4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctagonArea {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double area = 3 * Math.sqrt(3) * Math.pow(n, 2) / 2;
		
		System.out.printf("%.2f\n", area);
		br.close();
	}
}
