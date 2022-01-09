package Goorm.AlgorithmHeroes.T6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaeminHobby {
	static final int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long input = Long.parseLong(br.readLine());
		long tmp = (input+1) * input / 2 % mod;
		long sum = tmp * tmp % mod;
		
		System.out.println(sum);
		br.close();
	}
}
