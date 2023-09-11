package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		// 調べる英単語の配列定義
		String[] words = {"apple", "banana", "grape", "orange"};
		
		// 辞書に存在するか調べる
		dictionary.referer(words);
	}

}
