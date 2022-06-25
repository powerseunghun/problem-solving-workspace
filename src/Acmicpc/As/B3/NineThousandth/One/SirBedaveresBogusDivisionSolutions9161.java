package Acmicpc.As.B3.NineThousandth.One;

public class SirBedaveresBogusDivisionSolutions9161 {
	static boolean check(int i, int j) {
		if (((i % 10) == (j / 100)) && (i*(j%100) == (i/10) * j)) return true;
		else return false;
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				if (i % 111 == 0 && j % 111 == 0) continue;
				if (check(i, j)) {
					sb.append(i + " / " + j + " = " + (i / 10) + " / " + (j % 100) + "\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}
