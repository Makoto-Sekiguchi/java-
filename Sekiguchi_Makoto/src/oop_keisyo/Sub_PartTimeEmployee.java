package oop_keisyo;

public class Sub_PartTimeEmployee extends Employee_abstract{
	private static final int HOURLY_RATE = 1000;
	
	
	public Sub_PartTimeEmployee(String id, String name ) {//子クラスのコンストラクタ：Main_Q4クラスの実引数"P001", "佐藤"を受け取る。
		super(id, name);
	}
	@Override
	public int calculateDailyWage(int hoursWorked) {//Main_Q4クラスの実引数9を受け取る
		//int regularHours = 8;
		//double wage = regularHours * HOURLY_RATE;
		return hoursWorked * HOURLY_RATE;//残業がないためこれでおk。
	}
}
