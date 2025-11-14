package curriculum_C;

/*このファイルの役割：じゃんけんの勝敗の結果と対応するメッセージを定義するファイル。*/

public enum JankenResult {/*意味：enumから列挙型であるとわかる。enumが使われると、
JankenResult.WIN,JankenResult.LOSE,JankenResult.DRAWというようにenum名JankenResultの保有する種類(定数名)を扱える。*/
	//以下、じゃんけん結果の定数WIN等とその表示メッセージを定義。Enumに含まれる定数はインスタンス(具体情報を持つもの)として扱われる。
WIN ("あなたの勝ち！ループを終了します。"), LOSE("あなたの負け！もう一度！"), DRAW("あいこ！もう一度！");/*これらは、JankenResult型のインスタンスである。*/
	
	private final String message;
	
	JankenResult(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
/*5:enum→限定的な何かを行うパーツの一部が入ってると予測。
 5:enum JankenResult→JankenResult型の限定的なパーツが来る
 8:JankenResult型のWIN,LOSE,DRAWインスタンスで、具体的な情報は文字列の文章とわかる。
 10:各インスタンスの文字列情報を文字列型変数messageに格納してる。
 
 12:JankenResultコンストラクタ(5のやつとは別物)が、どこかから具体的な文字列情報を受け取るとわかる。
13:左辺のEnumインスタンス(WIN,LOSE,DRAW)の具体的な文字列情報にコンストラクタで受け取った文字列情報を代入してるとわかる。
15,16:ゲッターで、13を返してるとわかる。*/
 