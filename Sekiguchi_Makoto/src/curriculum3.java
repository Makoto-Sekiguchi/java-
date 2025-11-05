/**
 * 
 */

/**
 * 
 */
public class curriculum3 extends curriculum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//Q1 1～10になるまで出力を繰り返す
		int Qi = 0;//ここの変数宣言と初期化を忘れない！
		for (Qi = 1 ; Qi <= 10 ; Qi++) {
			System.out.println(Qi);//ここがprintなら、横一列に出力される。
		}
//Q2 2～20までの出力に奇数を飛ばす条件が絡む
		int Q2 = 0;
		for (Q2 = 2 ; Q2 <= 20 ; Q2++) {
			if (Q2 % 2 != 0) {
				continue;
			} else {
				System.out.println(Q2);
			}
		}
		
//Q3 
		int Q3 = 0;
		for (Q3 = 10 ; Q3 >= 1 ; Q3--) {
			System.out.println(Q3);
		}
	}

}
