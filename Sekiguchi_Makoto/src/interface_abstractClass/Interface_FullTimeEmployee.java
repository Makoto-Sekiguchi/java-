package interface_abstractClass;

public class Interface_FullTimeEmployee extends interface_AbstractClass_Billable{


	Interface_FullTimeEmployee(String id, String name) {//コンストラクタの設定
		super(id, name);
	}
	@Override
	public int costForDay(int hoursWorked) {//Billableインターフェイスの抽象メソッドにおけるInterface_FullTimeEmployee具体的な処理を作成
		double overWageRate = 1.25;
		int hourlyRate = 1250;
		int overTime = Math.max(0, hoursWorked - 8);//残業時間の定義➡Math.max()を使えばhoursWorkedが0より大きければそれが残業時間として認識できる！残業がなければ0が取り出される。
		int regularHours = hoursWorked - overTime;//通常労働時間：実引数で受け取った値から残業時間を引いたもの。
		
		return (regularHours * hourlyRate) + (int)(overTime * hourlyRate * overWageRate);//＋を用いれば無駄なif文を作成せずに済む！残業時間が0なら(regularHours * hourlyRate)のみ表示される。
	}
}
