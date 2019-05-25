package mytest;

class User {
	String name;

	User() {
//		this.name="Me!";
		this("Me!");
	}

	User(String name) {
		this.name=name;
	}

	void sayHi() {
		System.out.println("hi !"+this.name);
	}

}

class AdminUser extends User {

	AdminUser(String name) {
		super(name);
	}

	void sayHello() {
		System.out.println("hello !" + this.name);
	}

	@Override
	void sayHi() {
		System.out.println("[Admin]hi !" + this.name);
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		User tom = new User("Tom");
//		tom = new User();
		System.out.println(tom.name);
		tom.sayHi();

		AdminUser adminUs = new AdminUser("Bob");
		System.out.println(adminUs.name);
		adminUs.sayHi();
		adminUs.sayHello();
	}

}
