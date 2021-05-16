package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TSN2011 {
	static int getCount(int n) {
		int count = 0;
		while(n != 0) {
			if ((n % 10 != 0) && (n % 10) % 3 == 0) {
				count++;
			}
			n /= 10;
		}
		
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = a; i <= b; i++) {
			if (getCount(i) > 0) {
				for (int j = 0; j < getCount(i); j++) {
					System.out.print("K");
				}
				System.out.println();
			}
			else if (getCount(i) == 0){
				System.out.println(i);
			}
		}
	}
}
