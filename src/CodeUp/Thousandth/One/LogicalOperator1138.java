package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperator1138 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bool = Integer.parseInt(br.readLine()) == 0 ? "false" : "true";
		int res = !Boolean.parseBoolean(bool) ? 1 : 0;
		
		System.out.println(res);
	}
}
