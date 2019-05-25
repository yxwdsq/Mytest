package com.install.model;

//# 30 例外処理を扱って
class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

//generics
class MyInteger {
	public void getInt(int x) {
	System.out.println(x);
	}
}

//ジェネリクス generics
class MyData<T> {
	public void getData(T x) {
		System.out.println(x);
	}
}

//thread
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int ii = 0;ii < 500; ii++) {
			System.out.print('*');
		}
	}

}

public class MyReigai {

	public static void divs(int a,int b) {

		String msg;
		try  {
			if (b < 0) {
				throw new MyException("not minus!");
			}
			System.out.println(a / b);
		} catch (ArithmeticException e){
			msg = e.getMessage();
			System.err.println(msg);
		} catch (MyException e) {
			msg = e.getMessage();
			System.err.println(msg);
		} finally {
			System.err.println("=====end=======");
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		divs(3,0);
		divs(5,-10);

		//ラッパークラス wrapper class
		Integer i = new Integer(32);
		int n = i.intValue();

		System.out.println("Integer class instance int i:" + n);

		Double j = 22.222;
		System.out.println("Double class instance double j:" + j);

		try {
		Double d = new Double(3.33);
		d = null;
		double e = d;
		System.out.println("Integer class instance int :" + e);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		//ジェネリクス generics
		MyInteger int1 = new MyInteger();
		int1.getInt(55);

		MyData<String> mData1 = new MyData<>();
		mData1.getData("hello");
		MyData<Integer> mData2 = new MyData<>();
		mData2.getData(32);

		//thread
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

//		new Thread(r).start();
//		new Thread(new MyRunnable()).start();//無名クラス
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int ii = 0;ii < 500; ii++) {
					System.out.print('?');
				}
			}
		}).start();

		//# 35 Lambda ラムダ式
		// () -> {}
		new Thread(() -> {
			for ( int ii = 0; ii < 500; ii++) {
				System.out.print("o");
			}
		}).start();

		for (int ii = 0;ii < 500; ii++) {
			System.out.print('.');
		}
	}

}
