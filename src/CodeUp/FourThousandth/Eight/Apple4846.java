package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apple4846 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine().replaceAll(" ", "")), st = 0, apple = 0, sum = 0;
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			st = Integer.parseInt(tmp.split(" ")[0]);
			apple = Integer.parseInt(tmp.split(" ")[1]);
			sum += (apple -  (st * (apple / st)));
		}
		System.out.println(sum);
	}
}
