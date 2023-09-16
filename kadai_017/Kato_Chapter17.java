package kadai_017;

abstract public class Kato_Chapter17 {
	// フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	
	// メソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract void eachIntroduce();
	
	public void execlntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}
