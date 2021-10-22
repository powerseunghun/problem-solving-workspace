package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleArea {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double w = Double.parseDouble(tmp.split(" ")[0]);
		double h = Double.parseDouble(tmp.split(" ")[1]);
		
		System.out.printf("%.1f", w*h/2);
	}
}
