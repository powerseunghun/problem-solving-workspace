package CodeUp.SHR.Test;

public class MapTest {
	public static void main(String[] args) {
		String a = String.format("%08d", Integer.parseInt(Integer.toBinaryString(0)));
		String b = String.format("%08d", Integer.parseInt(Integer.toBinaryString(2)));
		String c = String.format("%08d", Integer.parseInt(Integer.toBinaryString(5)));
		
		for (int i = 160; i <= 160; i++) {
			b = String.format("%08d", Integer.parseInt(Integer.toBinaryString(i)));
			int count = 0;
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(j) != b.charAt(j)) count++;
			}
			System.out.println(Math.abs(i-0) + "차이 : " + count);
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
