package LettCode.Hundred.Medium;

public class P50Pow {
    static double myPow(double x, int n) {
        if (n == 0) return 1;
        double val = 0;
        if (n < 0) {
            val = myPow(x, Math.abs(n/2));
            if (Math.abs(n) % 2 == 0) return 1 / (val * val);
            else return 1 / (val * val * x);
        }
        else {
            val = myPow(x, n/2);
            if (n % 2 == 0) return val * val;
            else return val * val * x;
        }
    }
	public static void main(String[] args) {
		System.out.println(Math.pow(100, 50));
		System.out.println(myPow(100, 50));
	}
}
