package oop_polymorphism;

public class Pf_ContractEmployee extends Pf_Abstract_Employee {

	public Pf_ContractEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
@Override
	public int intcalculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;

		return hoursWorked * hourlyRate;
	}
}
