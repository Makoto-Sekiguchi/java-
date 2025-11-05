/**
 * 
 */

/**
 * 
 */
public class curriculum2 extends curriculum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1if文による条件分岐。falseなら出力さえない
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
	     }
		//Q2条件応じて出力内容を変える方法false時の出力が可能。具体的な区間があるので三項演算子やswitch文の適用はできない？
		int age = 25;
		if (age >= 20) {
			System.out.println("適正年齢です");
			}else if (age <= 30) {
				System.out.println("対象外です");
			}
		
		//Q3if-elseif-else文で複数の条件に応じた出力内容を決める。具体的な区間があるので三項演算子やswitch文の適用はできない？
		int age_Q3 = 18;
		if (age_Q3 >= 20) {
			System.out.println("成人です");
			} else if (age_Q3 >= 13) {
				System.out.println("ティーンエイジャーです");
			} else if (age_Q3 <= 19) {
				System.out.println("ティーンエイジャーです");
			} else {System.out.println("子供です");
			}
		
		//Q4大事三項演算子で最大値の出力とMath.maxを用いた最大値の出力
		int x = 30;
		int y = 15;
		int z = 50;
		int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		System.out.println(max);
//		int max2 = Math.max(x, Math.max(y, z));
//		System.out.println(max2);
		
		//Q5if文と三項演算子の２種類の書き方
		int num = 5;
		if (num > 0) {
			System.out.println("正の数です");
		}else if (num == 0) {
			System.out.println("0です");
		} else {System.out.println("負の数です");}
		/*三項演算子だと以下のコードになる。
		 int num = 5;
		 (num > 0) ? "正の数です" : ((num == 0) ? "0です" : "負の数です");
		  System.out.println(num);*/
		
		//Q6if文と三項演算子の２種類の書き方
		int value = 2;
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		/*三項演算子だと以下のコードになる
		 int value = 2;
		 (value % 2 == 0) ? "偶数です" : "奇数です"
		 System.out.println(value);*/
		
		//Q7
		int score_Q7 = 40;
		if (score_Q7 >= 90) {System.out.println("優");
		} else if (score_Q7 >= 70) {System.out.println("良");
		} else if (score_Q7 >= 50) {System.out.println("可");
		} else {System.out.println("不可");
		}
//		if (score_Q7 >= 90) {
//			System.out.println("優");
//		} else if (score_Q7 <= 89) {
//			System.out.println("良");
//		} else if (score_Q7 <= 69) {
//			System.out.println("可");
//		} else if (score_Q7 < 50){
//			System.out.println("不可");
//		}
	}
}
