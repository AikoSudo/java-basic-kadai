package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scan.nextLine();
			
			// r,s,pが入力された場合
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				return input;
			} else {
				System.out.println("正しいじゃんけんの手を入力してください");
			}
		}
	}
	
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int random = (int)Math.floor(Math.random() * 3);
		return hands[random];
	}
	
	public void playGame(String myChoice, String random) {
		HashMap<String, String> jyankenKeep = new HashMap<String, String>();
		jyankenKeep.put("r", "グー");
		jyankenKeep.put("s", "チョキ");
		jyankenKeep.put("p", "パー");
		
		System.out.println("自分の手は" + jyankenKeep.get(myChoice) + "、" + "対戦相手の手は" + jyankenKeep.get(random));
		
		if(jyankenKeep.get("r") == jyankenKeep.get(myChoice) && jyankenKeep.get("r") == jyankenKeep.get(random)) {
			System.out.println("あいこです");
		} else if(jyankenKeep.get("r") == jyankenKeep.get(myChoice) && jyankenKeep.get("s") == jyankenKeep.get(random)) {
			System.out.println("自分の勝ちです");
		} else if(jyankenKeep.get("r") == jyankenKeep.get(myChoice) && jyankenKeep.get("p") == jyankenKeep.get(random)) {
			System.out.println("自分の負けです");
		} else if(jyankenKeep.get("s") == jyankenKeep.get(myChoice) && jyankenKeep.get("r") == jyankenKeep.get(random)) {
			System.out.println("自分の負けです");
		} else if(jyankenKeep.get("s") == jyankenKeep.get(myChoice) && jyankenKeep.get("s") == jyankenKeep.get(random)) {
			System.out.println("あいこです");
		} else if(jyankenKeep.get("s") == jyankenKeep.get(myChoice) && jyankenKeep.get("p") == jyankenKeep.get(random)) {
			System.out.println("自分の勝ちです");
		} else if(jyankenKeep.get("p") == jyankenKeep.get(myChoice) && jyankenKeep.get("r") == jyankenKeep.get(random)) {
			System.out.println("自分の勝ちです");
		} else if(jyankenKeep.get("p") == jyankenKeep.get(myChoice) && jyankenKeep.get("s") == jyankenKeep.get(random)) {
			System.out.println("自分の負けです");
		} else {
			System.out.println("あいこです");
		}
	}
}
