package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CakeCutting2628 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		int c = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		boolean cross = false;
		
		if ((c > a && c < b) && (!(d > a && d < b))) {
			cross = true;
		}
		if ((d > a && d < b) && (!(c > a && c < b))) {
			cross = true;
		}
		if ((c > b && c < a) && (!(d > b && d < a))) {
			cross = true;
		}
		if ((d > b && d < a) && (!(c > b && c < a))) {
			cross = true;
		}
		
		if (cross) System.out.println("cross");
		else System.out.println("not cross");
	}
}
