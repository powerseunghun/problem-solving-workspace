package Acmicpc.As.B4.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flat3512 {
	static double[] arr = new double[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), c = Integer.parseInt(tmp.split(" ")[1]);
		for (int i = 0, a = 0; i < N; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			arr[2] += a;
			switch(tmp.split(" ")[1]) {
			case "bedroom":
				arr[0] += a;
				break;
			case "balcony":
				arr[1] += a;
				break;
			}
		}
		
		System.out.println((int)arr[2]);
		System.out.println((int)arr[0]);
		System.out.println((arr[2] - (arr[1]/2)) * c);
		br.close();
	}
}
