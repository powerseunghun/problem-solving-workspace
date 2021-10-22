package LettCode.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
	public static void main(String[] args) throws IOException {
		System.out.println(new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine()).reverse().toString());
	}
}
