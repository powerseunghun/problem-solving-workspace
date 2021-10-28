package Goorm.Level2;

public class NumberPrint {
	public static void main(String[] args) {
		for (int i = 0, val = 1; i < 5; i++, val = 1) {
			for (int j = 0; j < 8; j++) {
				if (j >= 8-1-i) System.out.print(val++);
				else System.out.print("0");
			}
			System.out.println();
		}
	}
}
