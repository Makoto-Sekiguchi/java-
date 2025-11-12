package oop_polymorphism;

public class Pf_FullTimeEmployee extends Pf_Abstract_Employee {

	public Pf_FullTimeEmployee(String id, String name) {
		super(id, name);
	}
@Override
	public int intcalculateDailyWage(int hoursWorked) {//総労働時間の定義int hoursWorked
		int hourlyRate = 1250;//時給の定義
		int overTime = Math.max(0, hoursWorked - 8);//残業があるときの残業時間の定義
		int regularHours = hoursWorked - overTime;//定時の定義：総労働時間から残業時間を引いたもの

		return (regularHours * hourlyRate) + (int) (overTime * hourlyRate * 1.25);
	}

}
