package Practice;
import java.util.Scanner;

public class BinaryTreeLCA {
	public int getLCA(int a, int b) {
		if (a == b) {
			return a;
		}
		else {
			if (a > b) {
				return getLCA(a / 2, b);
			}
			if (a < b) {
				return getLCA(a, b / 2);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(new BinaryTreeLCA().getLCA(a, b));
	}
}
