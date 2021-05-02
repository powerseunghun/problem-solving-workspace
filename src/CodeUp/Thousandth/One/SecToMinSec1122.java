package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecToMinSec1122 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sec = Integer.parseInt(br.readLine());
		
		System.out.println(sec / 60 + " " + sec % 60);
	}
}
