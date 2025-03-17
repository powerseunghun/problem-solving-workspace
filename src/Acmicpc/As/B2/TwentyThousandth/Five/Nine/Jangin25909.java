package Acmicpc.As.B2.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jangin25909 {
	static final int l = 10;
	static List<Double> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double res = Math.pow(10, 9);
		for (int i = 0; i < l; i++) {
			list.add(Double.parseDouble(br.readLine()));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 0; i < list.size()-1; i++) {
			res *= list.get(i)/(i+1);
		}
		
		System.out.println(String.format("%.07f", res));
		br.close();
	}
}
