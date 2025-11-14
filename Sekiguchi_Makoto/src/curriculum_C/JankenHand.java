package curriculum_C;
//このファイルの役割：enumを用いてグーチョキパーを列挙型で定義する。内部的に数値(0,1,2)を持たせることで、入力処理に利用できる。
//enumの使い時：限られた選択肢だけを持つ定数・状態・種類を扱うときに使う！

public enum JankenHand {//意味：これから書くのは列挙型であり、選択肢(グーチョキパーのみについて言及するクラス)クラス
	

	GU(0, "グー"),CHOKI(1, "チョキ"),PA(2, "パー");//意味：ユーザー入力が0ならGUかつ文字列グーに対応するという紐づけの役割。
	/*GU,CHOKI,PAはEnumと呼ばれる。*/
	public final int value;//意味：int valueからもわかるように、GU,CHOKI,PAの整数値を格納する役割。
	private final String name;//意味：String nameからもわかるように、GU,CHOKI,PAの文字列を格納する役割。
	
	JankenHand(int value, String name) {//受け取った数値を
		this.value = value;
		this.name = name;
	}
	
	//ユーザー入力をEnumに変換
	public static JankenHand fromValue(int value) {//ユーザが0と入力→このメソッドがJankenHand.GUを返す➡コード内で数字の代わりに文字GU(5行目のやつ)で扱えるようになる。
		for (JankenHand hand : values()) {
			if (hand.value == value) {
				return hand;
			}
		}
		//0,1,2以外の値が渡されたら例外処理をする
		throw new IllegalArgumentException("無効な手の値です：" + value);
	}
	
	
	@Override
	public String toString() {/*Enum表示をグー等の文字列に変換するメソッド。
	これがないと出力(System.out.println(JankenHand))するときにGUではなくJankenHandと表示されてしまう！*/
		return this.name;
	}
}
