package oop_polymorphism;



abstract class Pf_Abstract_Employee {
	protected String id;
	protected String name;

	public Pf_Abstract_Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract int intcalculateDailyWage(int hoursWorked);

	public String getName() {
		return name;
	}
}
