package Acmicpc.Step16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Check2981 {
	public int getGCD(int a, int b) {
		if (b == 0) return a;
		else return getGCD(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), GCD = 0;
		int[] nums = new int[N];
		Check2981 c = new Check2981();
		
		ArrayList<Integer> tmp = new ArrayList<>();
		Object[] ms = null;
		
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		GCD = nums[1] - nums[0];
		
		for (int i = 2; i < nums.length; i++) {
			GCD = c.getGCD(GCD, nums[i] - nums[i-1]);
		}
		
		for (int i = 2; i <= Math.sqrt(GCD); i++) {
			if (i == Math.sqrt(GCD)) {
				tmp.add(i);
				continue;
			}
			if (GCD % i == 0) {
				tmp.add(i);
				tmp.add(GCD / i);
			}
		}
		tmp.add(GCD);
		ms = tmp.toArray();
		Arrays.sort(ms);
		
		for (int i = 0; i < ms.length; i++) {
			System.out.print(ms[i] + " ");
		}
	}
}
