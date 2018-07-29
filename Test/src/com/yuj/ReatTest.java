package com.yuj;

class Reat {
	private int height;
	private int width;
	
	public Reat() {}
	
	public Reat(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getLength()
	{
		return (height + width) * 2;
	}
	
	public int getArea()
	{
		return height * width;
	}
}

class ReatTest {
	public static void main(String[] args)
	{
		Reat reat = new Reat(10, 15);
		
		System.out.println(reat.getHeight());
		System.out.println(reat.getWidth());
		System.out.println(reat.getArea());
		System.out.println(reat.getLength());
	}
}

