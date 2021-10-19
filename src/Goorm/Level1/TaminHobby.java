package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaminHobby {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long input = Long.parseLong(br.readLine());
		long tmp = (input+1) * input / 2 % 1000000007;
		long sum = tmp * tmp % 1000000007;
		
		System.out.println(sum);
	}
}
