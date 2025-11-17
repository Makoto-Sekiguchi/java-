package curriculumC;

import java.util.Scanner;

public class JankenMain2 {
	private static final int GU = 0;
	private static final int CHOKI = 1;
	private static final int PA = 2;

	private static final int WIN = 1;
	private static final int LOSE = 2;
	private static final int DRAW = 0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Player2 player = new Player2(scanner);
		CPU2 cpu = new CPU2();
		
		while(true) {
			
			//プレイヤーの手を決める
			int playerHand = player.getInputHand();
			//cpuの手を決める
			int cpuHand = cpu.getCPUHand();
			
			System.out.println("あなたの手：" + getHandName(playerHand));
			System.out.println("CPUの手：" + getHandName(cpuHand));
			
			int result = checkResult(playerHand, cpuHand);
			
			if (result == WIN) {
				System.out.println("あなたの勝ちですループ終了します。");
				break;//勝利したらループ脱出
			} else if (result == LOSE) {
				System.out.println("あなたの負け。もう一度！");
				
			} else {
				System.out.println("あいこ！もう一度！");
			}
			
			}
		scanner.close();
		}
		
		//勝利・あいこ・負け判定
		private static int checkResult(int playerHand, int cpuHand) {
			if (playerHand == cpuHand) {
				return DRAW;
			} else if ((playerHand == GU && cpuHand == CHOKI) || (playerHand == CHOKI && cpuHand == PA) || (playerHand == PA && cpuHand == GU)) {
				return WIN;
			} else {
				return LOSE;
			}
		}
		
		
		//手の数字を名前に変換するメソッド
		private static String getHandName(int hand) {
			return switch (hand) {
			case GU -> "グー";
			case CHOKI -> "チョキ";
			case PA -> "パー";
			default -> "無効な手";
			};
		} 
	}

//	private static int checkResult(int playerHand, int cpuHand) {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
//	}
//}

//	private static int checkResult(int playerHand, int cpuHand) {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
//	}
//
//}
