package Practice;
import java.util.Scanner;

public class BinaryTreeLCA2 {
	public int getLCA(int a, int b) {
		if (a == b) {
			return 0;
		}
		else {
			if (a > b) {
				return getLCA(a / 2, b) + 1;
			}
			if (a < b) {
				return getLCA(a, b / 2) + 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(new BinaryTreeLCA2().getLCA(a, b));
	}
}
