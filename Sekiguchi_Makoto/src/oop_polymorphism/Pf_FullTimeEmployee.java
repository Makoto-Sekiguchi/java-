package oop_polymorphism;

public class Pf_FullTimeEmployee extends Pf_Abstract_Employee {

	public Pf_FullTimeEmployee(String id, String name) {
		super(id, name);
	}
@Override
	public int intcalculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overTime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overTime;

		return (regularHours * hourlyRate) + (int) (overTime * hourlyRate * 1.25);
	}

}
