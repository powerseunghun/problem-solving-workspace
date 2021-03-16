package test;

public class Test2 {
	public static void main(String[] args) {
		for (int a = 9; a >= 1; a--) {
			for (int b = a; b >= 1; b--) {
				for (int c = b; c >= 1; c--) {
					if (a + b + c == 9) {
						System.out.println(a + ", " + b + ", " + c);
					}
				}
			}
		}
		
		System.out.println("end");
	}
}
