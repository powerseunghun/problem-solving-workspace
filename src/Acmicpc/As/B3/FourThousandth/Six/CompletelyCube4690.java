package Acmicpc.As.B3.FourThousandth.Six;

public class CompletelyCube4690 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int a = 1; a <= 100; a++) {
			for (int b = 2; b <= a; b++) {
				for (int c = b; c <= a; c++) {
					for (int d = c; d <= a; d++) {
						if (Math.pow(a, 3) == Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3)) {
							sb.append("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")\n");
						}
					}
				}
			}
		}
		System.out.print(sb.toString());
	}
}
