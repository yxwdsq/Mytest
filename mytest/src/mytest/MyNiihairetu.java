package mytest;

public class MyNiihairetu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//
		int[][] a = {{12,13,14,15},{21,22,23},{31,32,33,34}};

		int i = 0;
		int j = 0;

		for (i = 0;i < a.length; i++) {
			System.out.print("line's a["+i+"]:");
				for (j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]+",");
				}
			System.out.print("\n");

		}

	}

}
