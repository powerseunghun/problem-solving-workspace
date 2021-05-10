package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class AbsFunction1602 {
	static float abs(float f) {
		return f <= 0 ? f * -1 : f;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float f = Float.parseFloat(br.readLine());
		BigDecimal n = new BigDecimal(abs(f)+"");
		System.out.println(n.stripTrailingZeros().toPlainString());
	}
}
