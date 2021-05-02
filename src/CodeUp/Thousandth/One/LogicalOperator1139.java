package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperator1139 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		boolean a = Integer.parseInt(tmp.split(" ")[0]) == 1 ? true : false;
		boolean b = Integer.parseInt(tmp.split(" ")[1]) == 1 ? true : false;
		
		System.out.println(a && b ? 1 : 0);
	}
}
