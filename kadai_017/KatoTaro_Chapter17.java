package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	public void setGivenName() {
		givenName = "太郎";
	}
	
	// 抽象メソッドに具体的な処理を記述
	void eachIntroduce() {
		System.out.println("私はjavaが得意です");
	}
}
