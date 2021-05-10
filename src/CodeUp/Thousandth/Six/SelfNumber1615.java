package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelfNumber1615 {
	static int getNumber(int n) {
		if (n == 0) return 0;
		else return (n % 10) + getNumber(n/10);
	}
	static int getDnumber(int n) {
		return n + getNumber(n);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		boolean[] check = new boolean[b+1];
		Arrays.fill(check, true);
		
		for (int i = 1; i <= b; i++) {
			if (getDnumber(i) <= b) check[getDnumber(i)] = false;
		}
		
		for (int i = a; i <= b; i++) {
			if (check[i]) sum += i;
		}
		
		System.out.println(sum);
	}
}
