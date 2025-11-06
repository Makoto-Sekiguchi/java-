/**
 * 
 */
import java.util.Scanner;
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
		System.out.println();
//Q2 2～20までの出力に奇数を飛ばす条件が絡む
		int Q2 = 0;
		for (Q2 = 2 ; Q2 <= 20 ; Q2++) {
			if (Q2 % 2 != 0) {
				continue;
			} else {//偶数時にQ2
				System.out.println(Q2);
			}
			
		}
//		for (int i = 2 ; i <= 20 ; i += 2) {
//			System.out.println(i);
//		}
		System.out.println();
		
//Q3大事（不等号の向きを間違えると出力されないことがあるから） 
		int Q3 = 0;
		for (Q3 = 10 ; Q3 >= 1 ; Q3--) {//不等号の向きに気を付ける！Q3 <= 1だと、Q3<1またはQ3=1となってしまい、前者の条件が
			System.out.println(Q3);
		}
		System.out.println();
		
//Q4大事1～100までの合計を出力する方法
		int sum_Q4 = 0;
		for (int i_Q4 = 1 ; i_Q4 <= 100 ; ++i_Q4) {//1～100まで順に出力する。
			sum_Q4 += i_Q4;//現在のi_Q4値をsum_Q4に加算代入していくという意味。
			System.out.println(sum_Q4);//加算代入されたものを出力していく。
		}
		System.out.println();
		
//Q5大事二重のfor文で改行に応じた出力内容の変化（増減）を作ることができる	
		int rows = 5;
		for (int Q5_i = 1 ; Q5_i <= rows ; ++Q5_i) {//行を制御するfor文。rowsの５になるまでiが順に増える。Q5_iは１～５の範囲を持つ。
			for (int Q5_j = 1 ; Q5_j <= Q5_i ; ++Q5_j) {//Q5_jは１～５の範囲を持つ。
				System.out.print("*");//①Q5_jの出力内容は、５個になるまで＊が横並びに出力する。
				/*あとは各段ごとに改行されるようなコードが必要となる。*/
			}
			System.out.println();//②Q5_iに対するコードで、改行出力を意味する。
			/*まとめ：内側のforで＊が１～５個出力される。外側のforで１～５の各数字に切り替わるごとに改行出力することを意味する。
			 よって、*一個出力したら改行し、下の段に切り替わり*を２個出力したら改行し、、、というループが５になるまで繰り返される。*/
		}
		System.out.println();
//Q6大事whileでループする方法
		int Q6_i = 1;//for文は条件式内で変数宣言を同時に行えたけど、while文では、先に変数宣言したものを使う点で異なる！
		while ( Q6_i <= 10) {
			System.out.println(Q6_i);
			++Q6_i;
		}
		System.out.println();
		
//Q7大事if文が使えないときの２ずつ増えるループ処理
		int Q7_i = 2;
		while (Q7_i <= 20) {
			System.out.print(Q7_i + " ");
				Q7_i += 2;//偶数表記の定番はこれ！if文が挿入できないときはcontinueも使えないので２ずつ増える加算代入を使うよ！
		}
		System.out.println();
		
//Q8
		int Q8_i = 10;
		while(Q8_i >= 0) {
			System.out.println(Q8_i);
			--Q8_i;//前置デクリメントによって、現在の値Q8_i = 10を返してから順に引かれていくことを意味する。
		}
		System.out.println();
		
//Q9１～１００までの合計を出力
//for.ver.		int sum_Q4 = 0;
//		for (int i_Q4 = 1 ; i_Q4 <= 100 ; ++i_Q4) {//1～100まで順に出力する。
//			sum_Q4 += i_Q4;//現在のi_Q4値をsum_Q4に加算代入していくという意味。
//			System.out.println(sum_Q4);//加算代入されたものを出力していく。
//		}
//while.ver.
		int Q9_i = 1;
		int sum = 1;
		while(Q9_i <= 100) {
			++Q9_i;
			sum += Q9_i;
			if (sum == 5050) {
				System.out.println(sum);
			}
		}

//Q10大事
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください。");
		
		
		while(true) {
			int num_Q10 = sc.nextInt();
			if(num_Q10 == 0) {
				System.out.println("0が入力されたので終了しました。");
				break;
			}
			System.out.println("あなたが入力した数字は" + num_Q10 + "です。0が入力されるまで繰り返します");
		}
		sc.close();
		
//Q11
//		int [][] a = new int[9][9];
//		
//		for (int m = 1 ; m <= a.length ; m++) {
//			for(int n = 1 ; n <= a[m].length ; n++) {
//				a[m][n] = m * n;
//			}
//		}
//		
//		for (int m = 1 ; m <= a.length ; m++) {
//			for(int n = 1 ; n <= a[m].length ; n++) {
//				System.out.println(a[m][n]);
//			}
//			System.out.println();
//		}
		for (int a = 1 ; a <= 9 ; a++) {
			for (int b = 1 ; b <= 9 ; b++) {
				int result = a * b;
				System.out.println(result);
			}
		}
		
		
		
	}

}
////Q3大事（不等号の向きを間違えると出力されないことがあるから） 
//		int Q3 = 0;
//		for (Q3 = 10 ; Q3 >= 1 ; Q3--) {//不等号の向きに気を付ける！Q3 <= 1だと、Q3<1またはQ3=1となってしまい、前者の条件が
//			System.out.println(Q3);
//		}
//		System.out.println();
//		
////Q4大事1～100までの合計を出力する方法
//		int sum_Q4 = 0;
//		for (int i_Q4 = 1 ; i_Q4 <= 100 ; ++i_Q4) {//1～100まで順に出力する。
//			sum_Q4 += i_Q4;//現在のi_Q4値をsum_Q4に加算代入していくという意味。
//			System.out.println(sum_Q4);//加算代入されたものを出力していく。
//		}
//		
////Q5大事二重のfor文で改行に応じた出力内容の変化（増減）を作ることができる	
//		int rows = 5;
//		for (int Q5_i = 1 ; Q5_i <= rows ; ++Q5_i) {//行を制御するfor文。rowsの５になるまでiが順に増える。Q5_iは１～５の範囲を持つ。
//			for (int Q5_j = 1 ; Q5_j <= Q5_i ; ++Q5_j) {//Q5_jは１～５の範囲を持つ。
//				System.out.print("*");//①Q5_jの出力内容は、５個になるまで＊が横並びに出力する。
//				/*あとは各段ごとに改行されるようなコードが必要となる。*/
//			}
//			System.out.println();//②Q5_iに対するコードで、改行出力を意味する。
//			/*まとめ：内側のforで＊が１～５個出力される。外側のforで１～５の各数字に切り替わるごとに改行出力することを意味する。
//			 よって、*一個出力したら改行し、下の段に切り替わり*を２個出力したら改行し、、、というループが５になるまで繰り返される。*/
//		}
//Q6大事whileでループする方法
//		int Q6_i = 1;//for文は条件式内で変数宣言を同時に行えたけど、while文では、先に変数宣言したものを使う点で異なる！
//		while ( Q6_i <= 10) {
//			System.out.println(Q6_i);
//			Q6_i++;
//		}
//Q7大事if文が使えないときの２ずつ増えるループ処理
//		int Q7_i = 2;
//		while (Q7_i <= 20) {
//			System.out.print(Q7_i);
//				Q7_i += 2;//偶数表記の定番はこれ！if文が挿入できないときはcontinueも使えないので２ずつ増える加算代入を使うよ！
//		}
//Q10大事
//		Scanner sc = new Scanner(System.in);
//		System.out.println("数値を入力してください。");
//		
//		
//		while(true) {
//			int num_Q10 = sc.nextInt();
//			if(num_Q10 == 0) {
//				System.out.println("0が入力されたので終了しました。");
//				break;
//			}
//			System.out.println("あなたが入力した数字は" + num_Q10 + "です。0が入力されるまで繰り返します");
//		}
