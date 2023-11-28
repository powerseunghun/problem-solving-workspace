package Acmicpc.As.S5.TenThousandth.Five.Seven;

import java.io.IOException;

public class DuplicateNumber15719 {
	static final int len = 78888905;
	static int l = 0, b = 0;
	static byte[] arr = new byte[len];
	static long func() {
		long n = arr[l++] - '0';
		while ((b = arr[l++]) >= '0') {
			n = (n*10) + (b-'0');
		}
		return n;
	}
	public static void main(String[] args) throws IOException {
		System.in.read(arr, 0, len);
		long N = func(), sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += func();
		}
		
		System.out.println(sum-(N*(N-1)/2));
	}
}
