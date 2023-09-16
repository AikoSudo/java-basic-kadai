package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// 変数を宣言し、初期化
		int userAge = 30; // 年代
		int serviceCost = 0;// 料金
		
		// 年代に応じて料金を分岐する
		serviceCost = switch (userAge) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30, 40 -> 3000;
			case 50, 60, 70 -> 4000;
			case 80 -> 5000;
			default -> 500;
		};
		
		// 条件に一致する料金を出力する（今回は30代の料金）
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}

}
