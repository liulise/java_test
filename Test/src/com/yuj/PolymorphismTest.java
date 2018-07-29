package com.yuj;

abstract class Animal {
	abstract void eat();
	abstract void play();
}

class Cat extends Animal {
	void eat()
	{
		System.out.println("猫吃鱼");
	}
	void play()
	{
		System.out.println("和猫玩");
	}
	
	void catHandle()
	{
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal {
	void eat()
	{
		System.out.println("狗吃骨头");
	}
	void play()
	{
		System.out.println("和狗玩");
	}
	
	void dogHandle()
	{
		System.out.println("狗抓猫");
	}
}

public class PolymorphismTest {

	// 编译看左边，运行看右边
	public static void main(String[] args) {
		// 父类引用指向子类对象, 向上转型
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.eat();
		cat.play();
		dog.eat();
		dog.play();
		System.out.println("---------------");
		
		// 向下转型
		Cat c = (Cat)cat;
		Dog d = (Dog)dog;
		c.catHandle();
		d.dogHandle();
	}

}
