package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		// データを生成
		Car_Chapter14 gearSpeed = new Car_Chapter14();
		
		// 3を引数をして渡す
		gearSpeed.gearChange(3);
		
		// runメソッドを実行
		gearSpeed.run();
	}

}
