package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoodBrother {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int jinwoo = Integer.parseInt(input.split(" ")[0]);
		int sunwoo = Integer.parseInt(input.split(" ")[1]);
		int D = Integer.parseInt(br.readLine());
		
		for (int i = 1, val = 0; i <= D; i++) {
			if (i % 2 != 0) {
				if (jinwoo % 2 != 0) {
					val = (int)(jinwoo/2)+1;
				}
				else val = jinwoo/2;
				val = val == 0 ? 1 : val;
				jinwoo -= val;
				sunwoo += val;
			}
			else {
				if (sunwoo % 2 != 0) {
					val = (int)(sunwoo/2)+1;
				}
				else val = sunwoo/2;
				val = val == 0 ? 1 : val;
				sunwoo -= val;
				jinwoo += val;
			}
		}
		System.out.println(jinwoo + " " + sunwoo);
	}
}
