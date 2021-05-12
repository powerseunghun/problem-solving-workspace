package CodeUp.Thousandth.Six;

public class Alphametic1680 {
	public static void main(String[] args) {
		for (int s = 1; s <= 9; s++) {
			for (int o = 0; o <= 9; o++) {
				for (int t = 1; t <= 9; t++) {
					if ((s * 10 + o) + (s * 10 + o) == (t * 100) + (o * 10) + (o * 10)) {
						System.out.println((s*10+o) + "+" + (s*10+o) + "=" + (t*100+o*10+o));
					}
				}
			}
		}
	}
}
