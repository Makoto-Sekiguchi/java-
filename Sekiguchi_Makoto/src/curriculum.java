
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
		final int number = 10;
		//number = 5;と書くとエラーになる。
		System.out.println(number);
		int num2 = 15;
		num2 = 20;
		System.out.println(num2);
		
		
	}

}
