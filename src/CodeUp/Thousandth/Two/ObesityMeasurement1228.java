package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObesityMeasurement1228 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double h = Double.parseDouble(tmp.split(" ")[0]);
		double w = Double.parseDouble(tmp.split(" ")[1]);
		double sw = (h - 100) * 0.9;
		double ob = (w - sw) * 100 / sw;
		
		if (ob <= 10) {
			System.out.println("정상");
		}
		else if (ob <= 20) {
			System.out.println("과체중");
		}
		else {
			System.out.println("비만");
		}
	}
}
