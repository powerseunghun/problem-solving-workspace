package LettCode.Hundred.Easy;

public class P70ClimbingStairs {
	static int[] mem = null;
    static int func(int n) {
        if (n <= 3) return n;
        if (mem[n] > 0) return mem[n];
        else return mem[n] = func(n-1) + func(n-2);
    }
    static int climbStairs(int n) {
        mem = new int[n+1];
        return func(n);
    }
	public static void main(String[] args) {
		System.out.println(climbStairs(45));
	}
}
