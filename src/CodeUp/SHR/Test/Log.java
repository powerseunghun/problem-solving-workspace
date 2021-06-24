package CodeUp.SHR.Test;

public class Log {
	public static void main(String[] args) {
		String a = String.format("%08d", 
				Integer.parseInt(Integer.toBinaryString(0)));
		String b = String.format("%08d", 
				Integer.parseInt(Integer.toBinaryString(2)));
		System.out.println(a);
		System.out.println(b);
	}
}
