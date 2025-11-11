package oop_keisyo;

public class Sub_PartTimeEmployee extends Employee_abstract{
	private static final int HOURLY_RATE = 1000;
	
	
	public Sub_PartTimeEmployee(String id, String name ) {//コンストラクタ
		super(id, name);
	}
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;//残業がないためこれでおk。
	}
}
