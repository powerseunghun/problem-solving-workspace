package Practice;

import java.util.Scanner;

public class MakeBinaryCodeFiboVer {
	public int getBinaryCodeCount(int n) {
		if (n == 1) return 2;
		else if (n == 2) return 3;
		else return getBinaryCodeCount(n - 2) + getBinaryCodeCount(n - 1);
	}
	public static void main(String[] args) {
		MakeBinaryCodeFiboVer mbcf = new MakeBinaryCodeFiboVer();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(mbcf.getBinaryCodeCount(n));
	}
}
