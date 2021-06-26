package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Density4076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine(), st = null;
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int V = Integer.parseInt(tmp.split(" ")[1]);
		int R = Integer.parseInt(tmp.split(" ")[2]);
		double d = (double)M / V;
		
		if (R > d) st = "UP";
		else if (R == d) st = "STOP";
		else st = "DOWN";
		
		System.out.printf("%.2f %s", d, st);
	}
}
