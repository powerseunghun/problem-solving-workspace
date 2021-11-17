package Goorm.Level4;

public class TriangularNumber {
	static int getCount(int n) {
		int ans = 1, div = 0;
		for (int i = 2; i <= n/2; i++) {
			div = 0;
			while (n % i == 0) {
				div++;
				n /= i;
			}
			if (div != 0) ans *= (div+1);
		}
		return n > 1 ? ans *= 2 : ans;
	}
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; ; i++) {
			sum += i;
			if (getCount(sum) >= 500) {
				System.out.println(sum);
				return;
			}
		}
	}
}
