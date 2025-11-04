
public class curriculum {

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
		
		
		//javaレッスン
		
	}

}
