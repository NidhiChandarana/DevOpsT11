abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog : Bark!");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat : Meow!");
	}
}

class Abstract_Basic
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		d1.makeSound();
		Cat c1 = new Cat();
		c1.makeSound();
	}
}