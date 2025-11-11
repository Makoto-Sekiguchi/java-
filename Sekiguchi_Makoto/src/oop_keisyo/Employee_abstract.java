package oop_keisyo;

public abstract/*←抽象クラスの合図！忘れずに記述すること！*/ class Employee_abstract {//抽象クラスの作成完了
//field key
	private String employeeld;
	private String name;
	
	public Employee_abstract(String id, String name) {//コンストラクタ	
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
}
/*コンストラクタとなる条件２つ
1.クラス名とコンストラクタ名が一致する。
2.戻り値を持たない。*/