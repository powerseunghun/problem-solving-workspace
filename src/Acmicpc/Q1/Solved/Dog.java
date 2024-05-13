package Acmicpc.Q1.Solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dog {
	// OOP(Object Oriented Programming) -> 객체 지향 프로그래밍
	// Object = Field(속성) + Method(동작)
	// 움직여,돌아,
	// Field
	String turColor;
	String jong;
	
	// Method = function
	// ()  ->  Function(Parameter -> 이 함수가 동작하는데 필요한 변수)
	// variable -> 가변
	// public / private ->
	public static int hand(int a) {
		return a+1;
	}
	
	public static void main(String[] args) throws IOException {
		String str = "1";
		int a = Integer.parseInt(str);
		
		System.out.println(a+1);
	}
}
