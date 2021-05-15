package CodeUp.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NodeDistance1936 {
	static int f(int a, int b) {
		if (a == b) return 0;
		else {
			if (a > b) return f(a/2, b) + 1;
			else return f(a, b/2) + 1;
			
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(f(a, b));
	}
}
