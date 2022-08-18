package inheritance_programs;

public class Mango extends Fruit {
	int i=80;
	public void  demo()
	{
		int i=100;
		System.out.println("local i is:"+i);
		System.out.println("globel i of mango class is:"+this.i);
		System.out.println("glober i of fruit class is:"+super.i);
		int sum=i+this.i+super.i;
		System.out.println("sum is :"+sum);
		
	}
}
