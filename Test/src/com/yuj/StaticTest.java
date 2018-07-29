package com.yuj;

class StaticDeom {
	private static int staData;
	
	static void setStaData(int data)
	{
		staData = data;
	}
	
	static int getStaData()
	{
		return staData;
	}
}

public class StaticTest {

	public static void main(String[] args) {
		StaticDeom.setStaData(10);
		System.out.println(StaticDeom.getStaData());
		
		System.out.println(new StaticDeom().getStaData());
	}

}
