package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxValue1205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<Double> list = new ArrayList<>();
		double a = Double.parseDouble(tmp.split(" ")[0]);
		double b = Double.parseDouble(tmp.split(" ")[1]);
		double max = a + b;
		list.add(max);
		list.add(Math.abs(a-b));
		list.add(a * b);
		list.add(Double.max(a/b, b/a));
		list.add(Double.max(Math.pow(a, b), Math.pow(b, a)));
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		
		System.out.printf("%.6f", max);
	}
}
