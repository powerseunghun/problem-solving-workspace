package Programmers.level2;

public class JumpAndTeleportation {
	static int solution(int n) {
		int ans = 0;
		while (n > 0) {
			if (n % 2 == 0) n /= 2;
			else {
				n -= 1;
				ans++;
			}
			// n = n % 2 == 0 ? n / 2 : n - 1;
			// if (n % 2 != 0) ans++;
		}
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(solution(5000));
	}
}
