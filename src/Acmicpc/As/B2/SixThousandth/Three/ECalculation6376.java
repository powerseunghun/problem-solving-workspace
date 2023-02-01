package Acmicpc.As.B2.SixThousandth.Three;

public class ECalculation6376 {
	static void init(StringBuilder sb) {
		sb.append("n e\n");
		sb.append("- -----------\n");
		sb.append("0 1\n");
		sb.append("1 2\n");
		sb.append("2 2.5\n");
//		sb.append("3 2.666666667\n");
//		sb.append("4 2.708333333\n");
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		double i = 2, f = 3, res = 2.5;
		init(sb);
		
		for (;f < 10; f++) {
			i *= f;
			res += 1/i;
			sb.append(String.format("%.0f %.9f\n", f, res));
		}
		
		System.out.print(sb.toString());
	}
}