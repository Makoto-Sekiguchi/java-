
public class Curriculum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("Hello World");

		//自己紹介
		String name = "関口　誠";
		int age = 22;
		String hobby = "冒険";
		//自己紹介文の出力
		System.out.println(name);
		System.out.println(age);
		System.out.println(hobby);

		//学んだこと：出力コードのショートカットsysout
		System.out.println();

		//学んだこと：1行コメントと複数行コメントのやり方
		/*この囲いの中のみコメント化可能。複数行
		 にかけてコメントするときに便利*/
		//ここまでがjava2.4レッスン

		//javaレッスン2.5

		//学んだこと：任意の文字をコンソールに表示する
		System.out.println("任意の文字を表示する。");

		//javaレッスン2.7変数①

		/*学んだこと：定数はデータ型の直前にfinalを書く。変数と異なり後からの変更ができない。*/
		final int NUMBER = 10;//この後にNUMBER = 5;と書くとエラーになる。		
		System.out.println(NUMBER);
		//以下のように変数はあとから値の変更ができる。
		int num2 = 15;
		num2 = 20;
		System.out.println(num2);

		//変数byteNumの初期化
		byte byteNum = 10;
		byte byteNum2 = -128;//バイト型は最大128,最小-128である。129,-129はエラーとなる。
		//変数shortの初期化
		short shortNum = 100;
		short shortNum2 = -32768;//ショート型は最大32768,最小-32768の区間である。
		//変数intの初期化
		int intNum = 1000;
		int intNum2 = -2147483648;//int型は最大2147483648,最小-2147483648の区間である。
		//変数longの初期化
		long longNum = 10000;
		long longNum2 = 1;
		//変数floatの初期化
		float floatNum = 9.5f;
		float pi = 3.14159f;//フロート型の終わりにはfをつける。
		//変数doubleの初期化
		double doubleNum = 10.5;
		double doubleNum2 = 3.14;//double型にはfなくて良い。
		//変数charの初期化
		char letter = 'a';
		char character = 'b';//char型は''で1文字のみを囲い、表示をする時に使う。
		//変数Stringの初期化
		String letters = "ハロー";
		String str = "あいうえお";//String型は""で文を囲い、表示するときに使う。
		//変数booleanの初期化
		boolean isBoolean = true;
		boolean booleanNum = false;//boolean型はtrue,falseを使うときに用いる。

		//java課題Q3

		//11110を出力
		int num3 = 11110;
		System.out.println(num3);
		//System.out.println(longNum + intNum + shortNum + byteNum);
		//20を出力
		int num4 = 20;
		System.out.println(num4);
		//aハローtrueを出力
		char charNum = 'a';
		String stringNum = "ハロー";
		boolean booleanNum2 = true;
		System.out.print(charNum);
		System.out.print(stringNum);
		System.out.println(booleanNum2);
		//11130の数字をすべて足して出力
		int sum = 1;
		int sum2 = 1;
		int sum3 = 1;
		int sum4 = 3;
		int sum5 = 0;
		System.out.println(sum + sum2 + sum3 + sum4 + sum5);
		//小数点以外の数字をすべてかけて出力
		double doubleNum3 = 1.15;
		int ten = 10;
		doubleNum3 = (int) doubleNum3;
		System.out.println(doubleNum3 + ten);
		//10.5割る100の結果を出力
		double tenPointFive = 10.5;
		int hundred = 100;
		System.out.println(tenPointFive / hundred);
		//-90を10-100で出力
		int tenForSubtraction = 10;
		int hundredForSubtraction = 100;
		System.out.println(tenForSubtraction - hundredForSubtraction);

		//課題Q4
		String nameYamada = "山田太郎";
		System.out.println("こんにちは、" + nameYamada + "さん！");

		//課題Q5
		int age2 = 25;
		System.out.println("年齢：" + age2 + "歳");

		//課題Q6
		int num_1 = 10;
		int num_2 = 5;
		int sum1 = num_1 + num_2;
		System.out.println(sum1);

		//課題Q7
		int score = 80;
		score +=

				20;
		System.out.println("最終スコア：" + score);

		//型変換		
		//課題Q8浮動小数点型を整数型に変換する方法
		double price = 99.99;
		price = (int) price;
		System.out.println("整数価格：" + price);

		//大事課題Q9文字列型を整数型へ変換する方法
		String numStr = "123";
		int num = Integer.parseInt(numStr) + 10;//numStrを整数型に変換したものに10を足し、それを整数型の変数numに保存するという意味。
		System.out.println("変換後の値：" + num);

		//大事課題Q10整数型を文字列に変換する方法
		int num_Q10 = 50;
		String str_Q10 = String.valueOf(num_Q10);
		System.out.println("得点：" + str_Q10 + "点");

		//boolean型による真偽の判断		
		//Q11boolean型を用いてtrue,falseを判断してもらう
		int a_Q11 = 10;
		int b_Q11 = 20;
		boolean result = a_Q11 < b_Q11;
		System.out.println(result);

		//Q12三項演算子で真偽の判断に応じた２通りの出力ができる
		int x = 15;
		String result_Q12 = (x > 10) ? "OK" : "NG";
		System.out.println(result_Q12);
		//間違え例：x > 10 ? System.out.println("OK") : System.out.println("NG");

		//Q13大事replaceを用いた部分的な文字列の変更

		String originalText = "私はjavaがだいすきです。javaは楽しい！";
		String newStr = originalText.replace("java", "python");
		System.out.println(newStr);

		System.out.println("mainメソッド終了");

		//復習　
		//インクリメント
		/*前置インクリメントは++aで、現在の値に１足したものが実行される
		後置インクリメントはa++で、現在の値を実行した後に１が足されて使われる。*/
		//		int a = 10;
		//		int b = 10;
		//		int sumBA = a + b++;
		//		System.out.println(sumBA);
		//		int sumAB = ++a + b;//a=11+b=11前置インクのaだから１１に、後置インクのbである。sumBAで１０を実行しているのでここのbは１１になる。
		//		System.out.println(sumAB);

		//条件式の条件
		//		条件式になるのは代入式（＝）と四則演算子（＋－＊／）以外の演算子とtrueとfalse！
		//		const = 300 * 1.05:代入式出会って条件式ではない。=が目印
		//		3:ただの数字
		//		age != 30:代入式でも四則演算子でもない。
		//		true：条件式のtrue,falseに該当する。
		//		b + 5 < 20：代入式でも四則演算子でもないので条件式。			 
		//		isNumberic = true：=があり代入式に該当するため不適。

		//整数同士の割り算をfloat型に代入すると
		float ans = 7 / 6f;
		System.out.println(ans);//これだと小数点の計算まで行ってくれる。
		float ans2 = 7 / 6;
		System.out.println(ans2);//これだと整数同士の割り算がfloat型に代入されてる判定なので小数点付きの整数値が出力される。
	}

}
