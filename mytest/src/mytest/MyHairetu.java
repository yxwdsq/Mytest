package mytest;

import java.util.Arrays;

public class MyHairetu {

	public static void main(String[] args) {
		//hairetu 配列
		//sale1 sale2 ...
		//sales

//		int[] sales;
//		sales = new int[3];
//		sales[0] = 100;
//		sales[1] = 20;
//		sales[2] = 30;

//		int[] sales;
//		sales = new int[] {10, 200, 300};

//		int[] sales = {10, 400, 500};

//		System.out.println(sales[2]);
//		sales[2]=2000;
//		System.out.println(sales[2]);

		int[] sales = {900, 700, 800};
		int[] scores = {90, 80 ,30, 50 ,60};
		System.out.println("print sales:");
		for (int i = 0; i < sales.length; i++) {
			System.out.print(sales[i]+",");
		}
		System.arraycopy(sales, 0, scores, 2, 3);
		System.out.println("\n print scores:");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+",");
		}

		Arrays.sort(sales);
		System.out.println("\n print new sales:");

//		for (int i = 0; i < 3; i++) {
		for (int sale : sales) {
			System.out.println(sale);
		}
	}

}
