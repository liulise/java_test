package com.yuj;

class Fu {
	private int priNum = 123;
	public int normalNum = 456;
	static int sta = 789;

	public Fu() {}
	
	int getNum()
	{
		return priNum;
	}
	
	static int getSta()
	{
		return sta;
	}
}

class Zi extends Fu {
	String normalNum = "asd";
	
	public Zi()
	{
		super();
	}
	
	// 继承的方法 ：
	// 返回类型要一致
	// 访问权限不能更低
	// 静态方法需要用静态方法重写
	public int getNum()
	{
		return 123456;
	}
	
	public int getSuperNum()
	{
		return super.getNum();
	}
	
	static int getSta()
	{
		return sta + 1;
	}
}

public class ExtendTest {

	public static void main(String[] args) {
		Zi zi = new Zi();
		System.out.println(zi.normalNum);
		System.out.println(zi.getNum());
		System.out.println(zi.getSuperNum());
		System.out.println(zi.getSta());
	}

}
