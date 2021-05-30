package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replaceAll("[a-z]|_| |\\(|\\)", "");
		System.out.println(str.split(",")[0]);
		System.out.println(str.split(",")[1]);
	}
}
