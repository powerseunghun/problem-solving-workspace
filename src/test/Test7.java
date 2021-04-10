package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A {
	public void print() {
		System.out.println("AB");
	}
}
class B extends A {
	@Override
	public void print() {
		System.out.println("B");
	}
}
class C extends A {
	@Override
	public void print() {
		System.out.println("C");
	}
}
public class Test7 {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		Class obj = null;
		try {
			obj = Class.forName("test.A");
		} catch (ClassNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		Method[] m = obj.getMethods();
		A a = new A();
		System.out.println(m[0].invoke(a, null));
	}
}
