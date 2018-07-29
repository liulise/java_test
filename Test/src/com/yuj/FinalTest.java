package com.yuj;

//特点：
//类：类被final修饰，说明该类是最终类，不能被继承。
//成员变量：变量被final修饰后，就变成了常量。值不能被修改。
//成员方法：方法不能被子类重写。

class aa {
	final static String nn = "456";
	private static String n = "123";
	final int key = 1;
	public static final void setN(String n)
	{
		aa.n = n;
	}
	
	public static final String getN()
	{
		return n;
	}
	
	aa()
	{
//		key = 123;
	}
}

final class bb {}
//class cc extends bb {}

class cc extends aa {
//	public static final String getN()
//	{
//		return "asd";
//	}
}

public class FinalTest {

	public static void main(String[] args) {
		System.out.println(new cc().nn);
//		new cc().nn = "qwe";
	}

}
