package Curriculum_D;

//メインの処理、バトルロジック、ファイルの読み書き
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;//ランダムな数値を使うためのもの。ステータスやダメージ乱数で使用。
import java.util.Scanner;

public class MainBattle {
	//テキストファイルからデーモンのステータスを読み込むメソッド
	private static Character loadDemon(String filename) throws IOException {
		String name = "Demon";
		int HP = 0;
		int AK = 0;
		int SP = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("Demon_status.txt"))) {

			name = br.readLine();
			HP = Integer.parseInt(br.readLine().trim());
			AK = Integer.parseInt(br.readLine().trim());
			SP = Integer.parseInt(br.readLine().trim());

		} catch (IOException e) {//ファイルが見つからないなどのエラー
			System.out.println("ERRORステータスファイル読み込みエラー"/* + Demon_status.txt*/);
			throw e;
		} catch (NumberFormatException e) {
			System.err.println("ERROR.数値に変換できませんでした。" + "Demon_status.txt");
			throw new IOException("不正なファイル形式", e);
		}

		//Characterクラスのコンストラクタを使ってDemonオブジェクトを生成
		return new Character(name, HP, AK, SP);

	}

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String logFileName = "Battle_log.txt";
		
		System.out.println("Player VS Demon");
		Character firstAttacker = null;
		Character secondAttacker = null;
		
		
		//Demonのステータスをファイルから読み込み
		Character demon = null;
		
		try {
			demon = loadDemon("Demon_status.txt");
		} catch (IOException e) {//エラー発生でプログラム終了
			System.out.println("プログラムを終了します。");
			return ;
		}
		
		
		
		//Playerの名前を入力し、ランダムでステータスを設定するCharacterファイルの12行目とリンク
		System.out.println("Player名を入力してください。");

		String playerName = sc.nextLine();
		Character player = new Character(playerName);

		
		
		System.out.println("ステータス");
		System.out.println(player.toString());
		System.out.println(demon.toString());
		System.out.println("======================");

		
		
		//バトルログファイル準備
		try (PrintWriter logWriter = new PrintWriter(new FileWriter(logFileName))) {
			logWriter.println("Player:" + player.toString());
			logWriter.println("Demon:" + demon.toString());
			logWriter.println("========================");
			
			if (player.getSP() > demon.getSP()) {
				firstAttacker = player;
				secondAttacker = demon;
				System.out.println(player.getName() + "のSP(" + player.getSP() + ")のほうが高いため、先行です。");
			
			} else if (demon.getSP() > player.getSP()) {
				firstAttacker = demon;
				secondAttacker = player;
			} else {
				//SPが同じ場合はランダムで先行が決定
				if (rand.nextBoolean()) {
					System.out.println("SPが同じためランダムで" + player.getName() + "が先行です。");
					firstAttacker = player;
					secondAttacker = demon;
				} else {
					System.out.println("SPが同じためランダムで" + demon.getName() + "が先行です。");
					firstAttacker = demon;
					secondAttacker = player;
				}
			}
//			logWriter.println("先行：" + firstAttacker.getName() + ",後攻：" + secondAttacker.getName());
//			System.out.println("=====================================");

			
			
			//ターン制バトルの実行
			final int MAX_TURNS = 10;
			int turn = 1;
			while (player.isAlive() && demon.isAlive() && turn <= MAX_TURNS) {
				System.out.println("ターン" + turn + "===");
				logWriter.println("ターン" + turn + "===");
				
				//先行の攻撃
				if (firstAttacker.isAlive()) {
					int damage = firstAttacker.attack(secondAttacker);
					System.out.printf(
							"%sの攻撃！ %sに%dのダメージを与えた。", firstAttacker.getName(), secondAttacker.getName(),
							damage, secondAttacker.getHP());
					logWriter.printf(
							"%sの攻撃！ %sに%dのダメージ。%s残りHP:%d\n", firstAttacker.getName(), secondAttacker.getName(),
							damage, secondAttacker.getName(), secondAttacker.getHP());
				}
				//終了判定
				if (!secondAttacker.isAlive()) {
					break;
				}

				//後攻の攻撃
				if (secondAttacker.isAlive()) {
					int damage2 = secondAttacker.attack(firstAttacker);
					System.out.printf(
							"%sの攻撃！ %sに%dのダメージを与えた。\n", secondAttacker.getName(), firstAttacker.getName(),
							damage2);
					logWriter.printf(
							"%sの攻撃！ %sに%dのダメージ。%s残りHP:%d\n", secondAttacker.getName(), firstAttacker.getName(),
							damage2, firstAttacker.getName(), firstAttacker.getHP());
					turn++;
				}

//				//現在のHP表示
//				System.out.println("現在のHP:" + player.getName() + " " + player.getHP() + ", " + demon.getName() + " "
//						+ demon.getHP());
//				turn++;
			}
				
				
			//バトル結果の出力
			System.out.println("=========================");
			logWriter.println("============================");

			String resultMessage;
			if (player.isAlive()) {
				resultMessage = player.getName() + "の勝利";
			} else if (demon.isAlive()) {
				resultMessage = demon.getName() + "の勝利";
			} else if (turn > MAX_TURNS) {
				resultMessage = "10ターンが経過し、勝敗がつかなかったので引き分けです。";
			} else {
				resultMessage = "引き分け";
			}
			System.out.println(resultMessage);
			logWriter.println(resultMessage);
			logWriter.println("最終ステータス：");

			logWriter.println("Playere：" + player.toString());
			logWriter.println("最終ステータス：" + demon.toString());
			System.out.println("バトルの結果は" + "Demon_status.txt" + "に記録されました。");
		} catch (IOException e) {
			System.err.println("バトルログの書き込み中にエラーが発生しました。" + e.getMessage());
		}
		sc.close();
	}
}
