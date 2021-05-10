package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleFunction1580 {
	static float circle(int r) {
		return (float)(r * r * 3.14);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%.2f", circle(Integer.parseInt(br.readLine())));
	}
}
