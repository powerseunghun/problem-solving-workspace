package Acmicpc.OrderSubmit.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiffOfFiveAndSix2864 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int max = 0, min = 0;
		int[] vals = new int[2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < tmp.length; j++) {
				tmp[j] = i == 0 ? tmp[j].replaceAll("6", "5") : tmp[j].replaceAll("5", "6");
			}
			vals[i] = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]);
		}
		
		System.out.println(vals[0] + " " + vals[1]);
		br.close();
	}
}
