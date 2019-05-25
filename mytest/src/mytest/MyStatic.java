package mytest;

class Person{
	static String a = "String a";
	static String b;

	String c="String c";
	String d;

	static {
		System.out.println("======static start=====");
		printstatic();
		b = "String b";
		printstatic();
		System.out.println("======static end ======");
	}
	static void printstatic() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public Person(){
		System.out.println("======contarakuta start=====");
		printp();
		d = "String d";
		printp();
		System.out.println("======contarakuta end=====");
	}
	public void printp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	static void setstatic(String nameb) {
		b = nameb;
		printstatic();
	}
	public void setname(String named) {
		d = named;
		printp();
		b = named;
	}
}

public class MyStatic {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person p1 = new Person();
		p1.setstatic("testp1b");
		p1.setname("testp1d");
		Person p2 = new Person();
		p2.setstatic("testp2b");
		p2.setname("testp2d");
		p1.printp();
		p2.printp();

	}

}
