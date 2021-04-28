package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperation1055 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		if (a == 1 || b == 1) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
