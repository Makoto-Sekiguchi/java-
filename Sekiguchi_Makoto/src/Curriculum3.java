
import java.util.Random;
import java.util.Scanner;

public class Curriculum3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1 1～10になるまで出力を繰り返す
		int Qi = 0;//ここの変数宣言と初期化を忘れない！
		for (Qi = 1; Qi <= 10; Qi++) {
			System.out.println(Qi);//ここがprintなら、横一列に出力される。
		}
		System.out.println();
		//Q2 2～20までの出力に奇数を飛ばす条件が絡む
		int Q2 = 0;
		for (Q2 = 2; Q2 <= 20; Q2++) {
			if (Q2 % 2 != 0) {
				continue;
			} else {//偶数時にQ2を出力
				System.out.println(Q2);
			}

		}
		//		for (int i = 2 ; i <= 20 ; i += 2) {
		//			System.out.println(i);
		//		}
		System.out.println();

		//Q3大事（不等号の向きを間違えると出力されないことがあるから） 
		int Q3 = 0;
		for (Q3 = 10; Q3 >= 1; Q3--) {//不等号の向きに気を付ける！Q3 <= 1だと、Q3<1またはQ3=1となってしまい、前者の条件が
			System.out.println(Q3);
		}
		System.out.println();

		//Q4大事1～100までの合計を出力する方法
		int sum_Q4 = 0;
		for (int i_Q4 = 1; i_Q4 <= 100; ++i_Q4) {//1～100まで順に出力する。
			sum_Q4 += i_Q4;//現在のi_Q4値をsum_Q4に加算代入していくという意味。
			System.out.println(sum_Q4);//加算代入されたものを出力していく。
		}
		System.out.println();

		//Q5大事二重のfor文で改行に応じた出力内容の変化（増減）を作ることができる	
		int rows = 5;
		for (int Q5_i = 1; Q5_i <= rows; ++Q5_i) {//行を制御するfor文。rowsの５になるまでiが順に増える。Q5_iは１～５の範囲を持つ。
			for (int Q5_j = 1; Q5_j <= Q5_i; ++Q5_j) {//Q5_jは１～５の範囲を持つ。
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
		while (Q6_i <= 10) {
			System.out.println(Q6_i);
			++Q6_i;
		}
		System.out.println();

		//Q7大事if文が使えないときの２ずつ増えるループ処理
		int Q7_i = 2;
		while (Q7_i <= 20) {
			System.out.print(Q7_i + " ");
			Q7_i += 2;//偶数表記の定番はこれ！加算代入ではif文が挿入できず、continueも使えない。
		}
		System.out.println();
		System.out.println("Q7終了");
		System.out.println();

		//Q8
		int Q8_i = 10;
		while (Q8_i >= 0) {
			System.out.println(Q8_i);
			--Q8_i;//前置デクリメントによって、現在の値Q8_i = 10を返してから順に引かれていくことを意味する。
		}
		System.out.println("Q8終了");

		//Q9１～１００までの合計を出力
		//for.ver.		int sum_Q4 = 0;
		//		for (int i_Q4 = 1 ; i_Q4 <= 100 ; ++i_Q4) {//1～100まで順に出力する。
		//			sum_Q4 += i_Q4;//現在のi_Q4値をsum_Q4に加算代入していくという意味。
		//			System.out.println(sum_Q4);//加算代入されたものを出力していく。
		//		}
		//while.ver.
		int Q9_i = 0;
		int sum = 0;
		while (Q9_i < 100) {
			++Q9_i;
			sum += Q9_i;
			System.out.println(sum);
		}
		if (sum == 5050) {
			System.out.println(sum);
		}
		System.out.println("Q9終了");
		System.out.println();

		//Q10大事
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("数値を入力してください。");
		//		
		//		while(true) {
		//			int num_Q10 = sc.nextInt();
		//			if(num_Q10 == 0) {
		//				System.out.println("0が入力されたので終了しました。");
		//				break;
		//			}
		//			System.out.println("あなたが入力した数字は" + num_Q10 + "です。0が入力されるまで繰り返します");
		//		}
		//		sc.close();

		//Q11大事各項目（a,b）が対応する掛け算とそのフォーマット形式での出力

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				int result = a * b;//a=1*b=1,a=2*b=2...と続く計算をresult変数に格納する。
				System.out.printf("%02d * %02d = %2d", a, b, result);//フォーマット形式での出力
				if (b < 9) {//b<=9だと、9の段の掛け算の右側（一番端）にも||が入ってしまう。
					System.out.print("||");
				}
			}
			System.out.println();//a=9改行切り返しをしたいのでここで改行コードを書けばよいとわかる。
		}

		//Q12
		//目標：キーボード入力の受付と読み込み(134と146)は必ずセット！ランダム数字の生成とそれを適用するint型変数もセット！(136と138～143)
		Scanner scanner = new Scanner(
				System.in);/*キーボード入力の受付
							>　String input = scanner.nextLine().trim()とString normalizedInput = input.replaceAll(" ", "").toLowerCase()と即連想する！*/
		System.out.println("調べたい在庫は？");
		Random random = new Random();//ランダムな数字の生成の受付 > random.nextInt(数字の幅)とそれを格納する変数と即連想する！

		int stockTv = random.nextInt(12);//0～11の幅のランダムな数字をstockTv変数に格納
		int stockDisplay = 11 - stockTv;//ディスプレイの在庫はstockTvと合わせて１１個にする必要がある。
		int stockPc = random.nextInt(12);//0～11の幅のランダムな数字をstockPc変数に格納
		int stockAc = random.nextInt(12);//0～11の幅のランダムな数字をstockAc変数に格納
		int stockRefridge = random.nextInt(12);//0～11の幅のランダムな数字をstockRefridge変数に格納
		int stockWashing = random.nextInt(12);//0～11の幅のランダムな数字をstockWashing変数に格納
		int stockVapor = random.nextInt(12);
		int stockFan = random.nextInt(12);

		String input1 = scanner.nextLine().trim();//ユーザーが誤って入力した前後の空白を削除してくれる
		/*注意点
		不要な箇所145～149：String normalizedInput = input1.replaceAll(" ", "").toLowerCase();ユーザー入力は日本語のためここは不要！
		input1で入力を読み込んだ文字に対して、標準化処理を行い、ユーザーの入力を統一された形式に改めて変更した。
		具体的には、input1で読み込んだ文字に対して.replaceAll(" ", "")によって、誤入力されたスペースを除去し、
		.toLowerCase()によって、PcやpC,PC,pcといった入力内容がすべて小文字として認識されるようになる。
		つまり、すべてpcとして統一してくれるということ！
		*/
		String[] requestedItems = input1.split("、");//入力された内容(input1)に対して”、”を付けることで複数の入力を可能にする

		for (String itemInput : requestedItems) {
			//	
			//	

			switch (itemInput) {//scanner.がついてるinput1変数
			case "　", " ":
				System.out.println("商品名が入力されていません。");
				break;
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stockPc + "です。");
				break;
			case "エアコン":
				System.out.println("エアコンの残り台数は" + stockAc + "です。");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stockRefridge + "です。");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + stockWashing + "です。");
				break;
			case "テレビ", "ディスプレイ":
				System.out.println("テレビの残り台数は" + stockTv + "です。ディスプレイの在庫は" + stockDisplay + "です。");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + stockVapor + "です。");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + stockFan + "です。");
				break;
			default:
				System.out.println("存在しません");
				break;
			}

		}
		scanner.close();
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
//Q11大事
//
//		for (int a = 1 ; a <= 9 ; a++) {
//			for (int b = 1 ; b <= 9 ; b++) {
//				int result = a * b;
//				System.out.printf("%02d * %02d = %02d", a, b, result);//フォーマット形式での出力
//				if (b < 9) {//b<=9だと、9の段の掛け算の右側（一番端）にも||が入ってしまう。
//					System.out.print("||");
//				}
//			}
//			System.out.println();//a=9改行切り返しをしたいのでここで改行コードを書けばよいとわかる。
//		}
