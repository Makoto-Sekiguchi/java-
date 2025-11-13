package interface_abstractClass;



public abstract class Interface_AbstractClass_Billable 
implements Billable{//抽象クラス時、実装はこのクラスを継承したサブクラスで行う！
	//社員全員が必ず持つべきデータを定義している。今回は、idとname
	protected String id;
	protected String name;
	
	//コンストラクタで初期化
	Interface_AbstractClass_Billable(String id, String name) {
		this.id = id;
		this.name = name;
	}
	//Mainクラス内の実引数である社員名を取得するゲッター。コンストラクタ内に代入される。
	public String getName() {
		return name;
	}
}
