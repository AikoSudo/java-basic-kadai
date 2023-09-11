package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		// じゃんけんインスタンス定義
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		// 自分のじゃんけんの手を選択
		String myChoice = jyanken.getMyChoice();
		
		// 対戦相手の手をランダムで選択
		String random = jyanken.getRandom();
		
		// じゃんけんを実行
		jyanken.playGame(myChoice, random);
	}

}
