package basic;

import java.util.Scanner;

public class MinimalPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pasta = new int[3];
		int[] juice = new int[2];
		
		int minPasta, minJuice, minPrice;
		
		for (int i = 0; i < pasta.length; i++) {
			pasta[i] = sc.nextInt();
		}
		for (int i = 0; i < juice.length; i++) {
			juice[i] = sc.nextInt();
		}
		
		minPasta = pasta[0] <= pasta[1] ? pasta[0] <= pasta[2] ? pasta[0] : pasta[2] : pasta[1] <= pasta[2] ? pasta[1] : pasta[2];
		minJuice = juice[0] <= juice[1] ? juice[0] : juice[1];
		
		minPrice = minPasta + minJuice;
		
		System.out.printf("%.1f", minPrice + (minPrice * 0.1));
 	}
}