package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	// HashMapの宣言
	HashMap<String,String> fruits; 
	// コンストラクタ
	public Dictionary_Chapter20() {
		fruits = new HashMap<String,String>();
	
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
		for(String setWords: words) {
			if(setWords == "apple" || setWords == "banana" || setWords == "grape") {
				System.out.println(setWords + "の意味は" + fruits.get(setWords));
			} else {
				System.out.println(setWords + "は辞書に存在しません");
			}
		}
	}
}
