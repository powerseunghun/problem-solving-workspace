package CodeUp.TwoThousandth.One;

public class Cryptarithms2014 {
	public static void main(String[] args) {
		for (int s = 0; s < 10; s++) {
			for (int o = 0; o < 10; o++) {
				for (int t = 0; t < 10; t++) {
					int a = (s * 100) + (o * 10) + t;
					int b = (s * 10) + o;
					if ((a - b) == (t * 10 + t) && s != 0) {						
						System.out.printf("%d%d%d-%d%d=%d%d\n", s, o, t, s, o, t, t);
	                }
				}
			}
		}
	}
}
