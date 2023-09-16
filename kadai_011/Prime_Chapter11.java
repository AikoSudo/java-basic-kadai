package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// boolean型の配列の初期化
		boolean[] primeNumber = new boolean[100 + 1];
		for(int i = 2; i < primeNumber.length; i++) {
			primeNumber[i] = true;
		}
		// 素数ではない数を除去
		for(int i = 2; i * i <= 100; i++) {
			if(primeNumber[i]) {
				for(int j = i * i; j <= 100; j += i) {
					primeNumber[j] = false;
				}
			}
		}
		// 素数を出力
		for (int i = 2; i <= 100; i++) {
            if (primeNumber[i]) {
                System.out.println(i);
            }
        }
	}

}
