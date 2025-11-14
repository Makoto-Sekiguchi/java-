package curriculum_C;

import java.util.Scanner;

/*このファイルの役割：じゃんけんのメインロジック(ループ、判定呼び出し、結果表示)を管理するクラス。*/
public class JankenMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);//キーボード入力のデータを読み取るスキャナーオブジェクト(右辺)をscanner変数(左辺)に格納。
		Player player = new Player(scanner);/*スキャナーオブジェクトが格納されているscanner変数を引数に持つプレイヤーオブジェクト(右辺)をplayer変数に格納。
											Playerクラス(ファイル)のフィールド(private final Scanner scanner;)*/

		CPU cpu = new CPU();
System.out.println(JankenResult.WIN.getMessage());
		System.out.println("じゃんけんを開始します！");

		while (true) {
			System.out.println("グー(0),チョキ(1),パー(2)のいずれかを入力してください：");

			//以下、プレイヤーとCPUから手を取得するコード
			JankenHand playerHand = player.getInputHand();
			JankenHand cpuHand = cpu.getCPUHand();

			//手の表示とその出力コード
			System.out.println("あなたの出した手は：" + playerHand.toString());
			System.out.println("CPUの出した手は：" + cpuHand.toString());

			//以下、勝敗判定ロジックのメソッド化コード
			JankenResult result = checkResult(playerHand, cpuHand);

			//以下、結果のメッセージを出力コード
			System.out.println(result.getMessage());

			//以下、勝利したらループ脱出コード
			if (result == JankenResult.WIN) {
				break;
			}
		}
		scanner.close();
	}

	//勝利判定ロジックのメソッド化(Enumを引数と戻り値に使用)
	private static JankenResult checkResult(JankenHand pHand, JankenHand cHand) {
		if (pHand == cHand) {
			return JankenResult.DRAW;
		}

		int diff = (pHand.value - cHand.value + 3) % 3;

		if (diff == 1) {
			return JankenResult.WIN;
		} else {//fiff == 2で負け。
			return JankenResult.LOSE;
		}
		
	}
}

//以下、脳筋コード。
//while(true)	{	/*ループ内容
//１．入力選択メッセージ出力。
//２．プレイヤーが勝つまで入力読み取り。
//３．cpuの数字のランダム出力とそのメッセージ表示。
//４．
//*/
//System.out.println("0, 1, 2のいずれかを入力してください。");
//
//	Scanner sc = new Scanner(System.in);
//	int userInput = sc.nextInt();
//	
//	
//	Random random = new Random();
//	int cpu_randomOutput = random.nextInt(3);
//	System.out.println(cpu_randomOutput);
//	
///*ユーザーが勝つとループ脱出*/	
//	if (userInput == 0 && cpu_randomOutput == 1) {
//		System.out.println("あなたは勝ちました。ループを終了します。");
//		break;
//	}
//	if (userInput == 1 && cpu_randomOutput == 2) {
//		System.out.println("あなたは勝ちました。ループを終了します。");
//		break;
//	}
//	if (userInput == 2 && cpu_randomOutput == 0) {
//		System.out.println("あなたは勝ちました。ループを終了します。");
//		break;
//	}
//}