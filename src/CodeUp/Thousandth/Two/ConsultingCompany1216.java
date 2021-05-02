package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsultingCompany1216 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		
		if (a < (b - c)) {
			System.out.println("advertise");
		}
		else if (a > (b - c)) {
			System.out.println("do not advertise");
		}
		else {
			System.out.println("does not matter");
		}
	}
}
