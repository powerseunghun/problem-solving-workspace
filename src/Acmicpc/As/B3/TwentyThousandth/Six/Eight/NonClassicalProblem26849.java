package Acmicpc.As.B3.TwentyThousandth.Six.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NonClassicalProblem26849 {
	static List<Double> list = new ArrayList<Double>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double a = 0, b = 0, sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			a = Double.parseDouble(str.split(" ")[0]);
			b = Double.parseDouble(str.split(" ")[1]);
			
			double v = a/b;
			max = Math.max(max, v);
			min = Math.min(min, v);
			sum += v;
			list.add(v);
		}
		
		System.out.println(String.format("%.11f", min) + " " + String.format("%.11f", max) + " " + String.format("%.11f", sum));
		br.close();
	}
}
