package CodeUp.TwoThousandth.One;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class test {
	public static void main(String[] args) {
		double n = 1999999973;
		double x = 991.1999;
		DecimalFormat df = new DecimalFormat("#.####");
		double up = ((n-1) * (2 * 2 + (n-2)) / 2) + 1;
		System.out.println(up);
		System.out.println(up / n);
		System.out.printf("x*n:%.4f\n", x*n);
		System.out.printf("x*n:%.4f\n", new BigDecimal(x*n));
		BigDecimal a = new BigDecimal(x);
		BigDecimal b = new BigDecimal(n);
		double gg = Double.parseDouble(a.multiply(b).setScale(4, RoundingMode.CEILING).toString());
		up = (gg) + (up / n);
		System.out.printf("up :%.4f\n", up-gg);
//		double ss = (x * n) + (up / n);
//		double tmp = ((n-1) * (2 * 2 + n-2) / 2.0) + 1; 
//		System.out.printf("%.4f\n", tmp/n);
	}
}
//up : 1999999947000000260
//up / n : 999999987(총자람)
//1999999470000035.2
//1999999947000000260.0000