package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scan.nextLine();

			// r,s,pが入力された場合
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scan.close();
				return input;
			} else {
				System.out.println("正しいじゃんけんの手を入力してください");
			}
		}
	}

	public String getRandom() {
		String[] hands = { "r", "s", "p" };
		int random = (int) Math.floor(Math.random() * 3);
		return hands[random];
	}

	public void playGame(String myChoice, String random) {
		HashMap<String, String> jyankenKeep = new HashMap<String, String>();
		jyankenKeep.put("r", "グー");
		jyankenKeep.put("s", "チョキ");
		jyankenKeep.put("p", "パー");

		System.out.println("自分の手は" + jyankenKeep.get(myChoice) + "、" + "対戦相手の手は" + jyankenKeep.get(random));

		String result = "";

		if (myChoice.equals("r") && random.equals("s") || myChoice.equals("s") && random.equals("p")
				|| myChoice.equals("p") && random.equals("r")) { // 自分が勝つ場合
			result = "自分の勝ちです";
		} else if (myChoice.equals("r") && random.equals("p") || myChoice.equals("s") && random.equals("r")
				|| myChoice.equals("p") && random.equals("s")) { // 自分が負ける場合
			result = "自分の負けです";
		} else { // あいこの場合
			result = "あいこです";
		}

		System.out.println(result);
	}
}