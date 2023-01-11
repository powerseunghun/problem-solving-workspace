package Acmicpc.As.B3.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItsColdHere6830 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null, c = null;
		int res = Integer.MAX_VALUE, t = 0;
		
		while ((str = br.readLine()) != null) {
			t = Integer.parseInt(str.split(" ")[1]);
			if (t < res) {
				c = str.split(" ")[0];
				res = t;
			}
		}
		
		System.out.println(c);
		br.close();
	}
}
