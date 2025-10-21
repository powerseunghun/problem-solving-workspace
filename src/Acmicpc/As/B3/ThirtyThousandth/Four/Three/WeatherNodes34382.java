package Acmicpc.As.B3.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeatherNodes34382 {
	static final int l = 10;
	static double[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		double avg = 0;
		arr = new double[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			avg += arr[i];
		}
		avg /= (double)N;
		
		for (double el : arr) {
			if (Math.abs(avg-el) > l) {
				res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
