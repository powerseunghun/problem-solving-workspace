package basic;

import java.util.Scanner;

public class MineCraftHunter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myHealth = 0, basePower = 0, myPower = 0, potion = 0, turn = 0, howMany = 0;
		int enemyPower = 0, enemyHealth = 0, winner = 0;
		String howPotion = "";
		for (int i = 0; i < 4; i++) {
			myHealth += sc.nextInt();
		}
		myPower = sc.nextInt();
		potion = sc.nextInt();
		
		if (potion == 1) {
			howPotion = sc.next();
			turn = sc.nextInt();
			switch(howPotion.charAt(0)) {
			case '*':
				howMany = Integer.parseInt(howPotion.substring(1, howPotion.length()));
				basePower = myPower;
				myPower = myPower * howMany;
				break;
			case '+':
				howMany = Integer.parseInt(howPotion.substring(1, howPotion.length()));
				basePower = myPower;
				myPower = myPower + howMany;
				break;
			}
		}
		enemyPower = sc.nextInt();
		enemyHealth = sc.nextInt();
		while (true) {
			enemyHealth -= myPower;
			if (enemyHealth <= 0) {
				winner = 1;
				break;
			}
			myHealth -= enemyPower;
			if (myHealth <= 0) {
				winner = 0;
				break;
			}
			turn--;
			if (potion == 1 && turn <= 0) {
				myPower = basePower;
			}
		}
		System.out.println(winner);
	}
}
