package curriculum_C;

/*このファイルの役割：じゃんけんの勝敗と対応するメッセージを定義するファイル。*/
public enum JankenResult {
WIN ("あなたの勝ち！ループを終了します。"), LOSE("あなたの負け！もう一度！"), DRAW("あいこ！もう一度！");
	
	private final String message;
	
	JankenResult(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
