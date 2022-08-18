package inheritance_programs;

public class Fruit {
	int i=20;
	public void test()
	{
		int i=50;
		System.out.println("local i is:"+i);
		System.out.println("globel i is:"+i);
		int sum=i+this.i;
		System.out.println("sum is:"+sum);
	}

}
