package Acmicpc.As.B3.TwentyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Кондиционер21573 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int c = Integer.parseInt(tmp.split(" ")[0]);
		int w = Integer.parseInt(tmp.split(" ")[1]);
		int res = 0;
		tmp = br.readLine();
		
		switch(tmp) {
		case "heat":
			res = w>c ? w : c;
			break;
		case "freeze":
			res = c > w ? w : c;
			break;
		default:
			res = tmp.equals("auto") ? w : c;
			break;
		}
		
		System.out.println(res);
		br.close();
	}
}
