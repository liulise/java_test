package com.yuj;

class LifeCycle {
	private int aa;
	static int a = 123;
	
	static {
		System.out.println(a);
	}

	{
		aa = 456;
		System.out.println("BBBBB");
	}

	public LifeCycle() {
		{
			System.out.println("CCCCC");
		}
	}

	static {
		System.out.println("DDDDD");
	}

	{
		System.out.println(aa);
	}
	
	public int getAa()
	{
		{
			aa = 789;
		}
		return aa;
	}
}

public class LifeCycleTest {

	public static void main(String[] args) {
		LifeCycle s = new LifeCycle();
		System.out.println("--------------");
		LifeCycle ss = new LifeCycle();
	}

}
