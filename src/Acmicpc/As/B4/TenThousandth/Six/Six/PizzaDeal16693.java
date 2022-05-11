package Acmicpc.As.B4.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaDeal16693 {
	static final double PI = 3.14159265359;
	static double[] arr = new double[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		boolean flag = false;
		for (int i = 0; i < arr.length; i+=2) {
			tmp = br.readLine();
			arr[i] = Double.parseDouble(tmp.split(" ")[0]);
			arr[i+1] = Double.parseDouble(tmp.split(" ")[1]);
		}
		
		flag = (arr[0] / arr[1]) > (arr[2] * arr[2] * PI / arr[3]);
		
		if (flag) System.out.println("Slice of pizza");
		else System.out.println("Whole pizza");
		br.close();
	}
}
