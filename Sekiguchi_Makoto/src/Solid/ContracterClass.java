package Solid;

public class ContracterClass implements CalculateSalary {

	private String name;
	private String type;
	private int hours;
	
	public ContracterClass(String name2, String type2, int hours2) {
		name = name2;
		type = type2;
	    hours = hours2;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getHours() {
		return hours;//注意点：あくまでgetする値は7行目なのでhours2は不可！
	}
	@Override
	
	public int calcSalary(int hoursWorked) {
		int wagePerHour = 1000;
		return hours * wagePerHour;//getHours()でもhoursでもおｋ
		}
}
		
//	private String name;
//	private int hours;
//
//	public ContracterClass(String name, int hours) {
//		this.name = name;
//		
//		this.hours = hours;
//	}
//
//	@Override
//	public String getName() {
//		return name;
//	}
//	
//	@Override
//	public int getHours() {
//		return hours;
//	}
//
//	@Override//日給計算の処理は正社員と契約社員で異なるためここで具体的な計算処理を記述。
//	public int SalaryCalculater() {//具体処理内にreturnがあるなら出力はMainクラスで行うし、ここのvoidはint(=()内の型)にしないとreturn不可だよ！
//		int wageRate = 1200;
//		int salary = hours * wageRate;
//		return salary;
//		
//	}
	//	SubClass_FullTime_Employee(String name, String type, int hour) {
	//		super(name, type, hour);
	//	}
	//
	//	@Override
	//	public int SalaryCalculater(int hoursWorked) {
	//		int wagePerHour = 1200;
	//		int wagePerDay = getHours() * wagePerHour;
	//		return wagePerDay;
	//	}

