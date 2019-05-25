package mytest;

public class MySamhairetu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//

		String[][][] stuname= {
				{{"a111","a112"},{"a121","a122"}},
				{{"a211","a212"},{"a221","a222"}}
				};

		int i = 0;
		int j = 0;
		int m = 0;

		for (i = 0;i < stuname.length; i++) {
			System.out.println("3hairetu's stuname["+i+"]:");
				for (j = 0; j < stuname[i].length; j++) {
					System.out.print("2haireitu-line's stuname["+i+"]["+j+"]:");
					for (m = 0; m < stuname[i][j].length; m++) {
						System.out.print(stuname[i][j][m]+",");
					}
					System.out.print("\n");
				}
				System.out.print("\n");
		}
	}

}
