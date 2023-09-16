package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		givenName = "一郎";
	}
	
	// 抽象メソッドに具体的な処理を記述
	void eachIntroduce() {
		System.out.println("好きな食べのもはりんごです");
	}
}
