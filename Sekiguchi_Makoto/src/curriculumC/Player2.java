package curriculumC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player2 {
	private final Scanner scanner;

	public Player2(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getInputHand() {//インスタンスメソッドであるgetHand(){]。インスタンスメソッドは必ず参照元のオブジェクト名のEnum_Handを書くこと！
		while (true) {
			try {
				int hand = scanner.nextInt();
				if (hand >= 0 && hand <= 2) {
					return hand;
				} else {
					System.out.println("ERROR.0,1,2のいずれかを入力してください。");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR.無効な入力形式です。数字を入力してください。");
				scanner.close();
			}
		}
	}
}
//インスタンスメソッド：