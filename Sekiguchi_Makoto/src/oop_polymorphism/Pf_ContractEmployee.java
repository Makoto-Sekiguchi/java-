package oop_polymorphism;

public class Pf_ContractEmployee extends Pf_Abstract_Employee {

	public Pf_ContractEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
@Override
	public int intcalculateDailyWage(int hoursWorked) {//抽象クラスから引用したintcalculateDailyWageメソッド。契約社員とフルタイム社員では処理の内容が異なるためここだけ記述している。
	//Pf_Mainクラス内のintcalculateDailyWageメソッドが実行されると以下の処理を行う。
	
	//以下、契約社員の場合の処理。働いた時間int hoursWorkedに対する処理を表す。
		int hourlyRate = 1000;//時給の定義：時給が１０００円

		return hoursWorked * hourlyRate;//総労働時間に時給をかけ合わせたものを返す。
	}
}
