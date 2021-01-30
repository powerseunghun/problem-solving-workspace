package basic;

import java.util.Scanner;

public class BinaryScaleRealNumber {
	public String getBinary(double lf) {
		int count = 0;
		String s = "";
		while(count < 10) {
			count++;
			lf *= 2;
			s += (lf + "").charAt(0);
			if (lf >= 1) {
				lf -= 1;
			}
		}
		
		return s;
	}
	public static void main(String[] args) {
		double lf = Double.parseDouble("0." + (new Scanner(System.in).nextLine()+ ""));
		System.out.println(new BinaryScaleRealNumber().getBinary(lf));
	}
}
