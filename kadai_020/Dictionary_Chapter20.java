package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	// HashMapの宣言
	HashMap<String, String> fruits;

	// コンストラクタ
	public Dictionary_Chapter20() {
		fruits = new HashMap<String, String>();

		// 要素を追加
		fruits.put("apple", "りんご");
		fruits.put("peach", "桃");
		fruits.put("banana", "バナナ");
		fruits.put("lemon", "レモン");
		fruits.put("pear", "梨");
		fruits.put("kiwi", "キウィ");
		fruits.put("strawberry", "いちご");
		fruits.put("grape", "ぶどう");
		fruits.put("muscat", "マスカット");
		fruits.put("cherry", "さくらんぼ");
	}

	public void referer(String[] words) {
		for (String word : words) {
			// 配列のキーがMap内に存在するか調べる
			String result = fruits.get(word);
			//辞書を調べた結果により出力を分岐
			if (result == null) {
				System.out.println(word + "は辞書に存在しません");
			} else {
				System.out.println(word + "の意味は" + result);
			}
		}
	}
}
