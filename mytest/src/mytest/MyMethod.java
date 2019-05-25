package mytest;

public class MyMethod {

	public static void sayHi() {
		System.out.println("hi tom");
	}
	/*	public static void sayHi(String name) {
			System.out.println("hi " + name);
		}
		public static void sayHi(String name,String greathi) {
			System.out.println(greathi+name);
		}*/
	public static String sayHi(String name) {
		return "hi " + name;
	}
	public static String sayHi(String name,int x) {
		x +=20;
		return x + name;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sayHi();
		String msg1=sayHi("Steve");
		String msg2=sayHi(" jerry",10);

		System.out.println(msg1);
		System.out.println(msg2);

	}

}
