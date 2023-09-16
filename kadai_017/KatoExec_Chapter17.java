package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// 各子クラスのオブジェクトを生成
		KatoTaro_Chapter17 katoTaro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 katoIchiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 katoHanako = new KatoHanako_Chapter17();
		
		// setGivenNameメソッドを実行
		katoTaro.setGivenName();
		katoIchiro.setGivenName();
		katoHanako.setGivenName();
		
		// execlntroduceメソッドを実行
		katoTaro.execlntroduce();
		System.out.println();
		katoIchiro.execlntroduce();
		System.out.println();
		katoHanako.execlntroduce();
	}
}
