package Acmicpc.OrderSubmit.TenThousandth.One.Fourr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumber11444 {
	static final long MOD = 1000000007;
	static long[][] arr = {{1,1}, {1,0}};
	static long[][] squared(long[][] arr, long[][] arr2) {
		long[][] tmpArr = new long[2][2];
		tmpArr[0][0] = ((arr[0][0]*arr2[0][0]) + (arr[0][1]*arr2[1][0])) % MOD;
		tmpArr[0][1] = ((arr[0][0]*arr2[0][1]) + (arr[0][1]*arr2[1][1])) % MOD;
		tmpArr[1][0] = ((arr[1][0]*arr2[0][0]) + (arr[1][1]*arr2[1][0])) % MOD;
		tmpArr[1][1] = ((arr[1][0]*arr2[0][1]) + (arr[1][1]*arr2[1][1])) % MOD;
		
		return tmpArr;
	}
	static long[][] arrPower(long[][] A, long power) {
		if (power <= 1) return A;
		long[][] tmpArr = arrPower(A, power/2);
		tmpArr = squared(tmpArr, tmpArr);
		
		if (power % 2 == 1L) tmpArr = squared(tmpArr, arr);
		return tmpArr;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long[][] fiboArr = arrPower(arr, N-1);
		
		System.out.println(fiboArr[0][0]);
		br.close();
	}
	// ref : st-lab.tistroy.com
}
