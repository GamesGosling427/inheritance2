package inheritance_programs;

public class Cardriver {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		System.out.println(v1.a);
		System.out.println(v1.b);
		v1.test();
		System.out.println("====================");
		Car c1=new Car();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.x);
		System.out.println(c1.y);
		c1.test();
		c1.demo();
	}

}
