package mytest;

class People{
	private String Peoplea = "String a";
	private String Peopleb;

	String Peoplec="String c";
	String Peopled;

	public People() {}

	public People(String namea,String nameb) {
		Peoplea = namea;
		Peopleb = nameb;
	}

	public void printa() {
		System.out.println("Peoplea = " + Peoplea);
		System.out.println("Peopleb = " + Peopleb);
		System.out.println("Peoplec = " + Peoplec);
		System.out.println("Peopled = " + Peopled);
	}

}

public class MyPravite {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		People pn1 = new People();
		pn1.Peopled = "erro1";
		pn1.printa();
		People pn2 = new People("ok1","ok2");
		pn2.printa();

	}

}
