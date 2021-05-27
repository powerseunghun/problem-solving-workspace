package CodeUp.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OverlapDistinction2803 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double x1 = Double.parseDouble(tmp.split(" ")[0]);
		double y1 = Double.parseDouble(tmp.split(" ")[1]);
		double d1 = Double.parseDouble(tmp.split(" ")[2]);
		
		tmp = br.readLine();
		double x2 = Double.parseDouble(tmp.split(" ")[0]);
		double y2 = Double.parseDouble(tmp.split(" ")[1]);
		double d2 = Double.parseDouble(tmp.split(" ")[2]);
		
		double dist = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		
		if (dist > d1 + d2) {
			System.out.println("not overlapped");
		}
		else System.out.println("overlapped");
		
	}
}
