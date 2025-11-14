package curriculum_C;

public enum JankenHand {
//このファイルの役割：グーチョキパーを列挙型で定義する。内部的に数値(0,1,2)を持たせることで、入力処理に利用できる。
	GU(0, "グー"),CHOKI(1, "チョキ"),PA(2, "パー");
	
	public final int value;
	private final String name;
	
	JankenHand(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static JankenHand fromValue(int value) {
		for (JankenHand hand : values()) {
			if (hand.value == value) {
				return hand;
			}
		}
		//0,1,2以外の値が渡されたら例外処理をする
		throw new IllegalArgumentException("無効な手の値です：" + value);
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}
}
