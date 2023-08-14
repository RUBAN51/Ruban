package conceptsOfOOPs;
class parent
{
	void eat() 
	{
		System.out.println("Parent is eating");
	}
}

public class child_OR extends parent 
{
	void eat() 
	{
		super.eat();
		System.out.println("Child is eating");
	}
	public static void main(String[] args) 
	{
		
		child_OR c = new child_OR();
		c.eat();
	}
}
