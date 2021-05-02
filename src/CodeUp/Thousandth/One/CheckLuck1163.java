package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckLuck1163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int y = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int d = Integer.parseInt(tmp.split(" ")[2]);
		
		if ((y + m + d) / 100 % 10 % 2 == 0) {
			System.out.println("대박");
		}
		else {
			System.out.println("그럭저럭");
		}
	}
}
