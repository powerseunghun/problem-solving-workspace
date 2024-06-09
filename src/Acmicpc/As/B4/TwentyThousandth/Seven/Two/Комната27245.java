package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Комната27245 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine());
		int h = Integer.parseInt(br.readLine());
		int min = Math.min(w, l);
		int max = Math.min(w, l);
		
		System.out.println((min>=h*2 && max<=min*2) ? "good" : "bad");
		br.close();
	}
}
