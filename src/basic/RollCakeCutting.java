package basic;

import java.util.Scanner;

public class RollCakeCutting {
	public int getWeightTail(int[] rollCake, int n, int sum) {
		if(n == 0) return sum + rollCake[0];
		else return getWeightTail(rollCake, n-1, sum + rollCake[n]);
	}
	public int getWeight(int[] rollCake, int cut) {
		return getWeightTail(rollCake, cut - 1, 0);
	}
	
	public int cutting(int[] rollCake, int weight, int x, int y) {
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RollCakeCutting rcc = new RollCakeCutting();
		int[] rollCake = new int[sc.nextInt()];
		int m = 0, x = 0, y = 0;
		
		for (int i = 0; i < rollCake.length; i++) {
			rollCake[i] = i + 1;
		}
		
		System.out.println(rcc.getWeight(rollCake, 300000));
	}
}
