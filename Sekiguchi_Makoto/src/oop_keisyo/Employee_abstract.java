package oop_keisyo;

public abstract/*←抽象クラスの合図！忘れずに記述すること！*/ class Employee_abstract {//抽象クラスの作成完了
//field key
	private String employeeld;
	private String name;
	
	public Employee_abstract(String id, String name) {//コンストラクタ。
		//Mainクラスのmainメソッド内の実引数が渡されることも忘れない！今回は、"F001", "田中"が渡され、
		//次に抽象クラスに渡された"F001", "田中"がサブクラスへと渡される。
		this.employeeld = id;
		this.name = name;
	}
	
	public String getEmployeeld() {//getter
		return employeeld;
	}
	public String getName() {//getter
		return name;
	}
	public abstract int calculateDailyWage(int hoursWorked);//abstract method：子クラスでの機能の実装が強制されるメソッドのこと。
	//また、Mainクラスのmainメソッド内の実引数が渡されることも忘れない！今回は、int hoursWorked = 9が渡され、
	//次に抽象クラスに渡されたint hoursWorked = 9がサブクラスへと渡される。
}
/*コンストラクタとなる条件２つ
1.クラス名とコンストラクタ名が一致する。
2.戻り値を持たない。*/
//抽象クラスの全体像：全サブクラスに共通する内容のみを記述する。今回は社員IDと社員名を受け取り、返すこと。