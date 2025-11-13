package Solid;
/*コードの流れ：field keyの設定→コンストラクタを作成しMainクラスの実引数が代入されるようにする。
 * →オーバーライドでgetName()とgetHours()を使い、コンストラクタ処理によって代入されたnameとhoursを取得しreturn。
 * また、具体的な給与の計算処理も記述しreturn。*/

/*ポイント：抽象クラスがなく具象クラスのみの場合、
 * 以下(7～13行目)のように、本来抽象クラスで記述するfield keyとコンストラクタ内での初期値を設定することをわすれない！
 */
public class FulltimerClass implements CalculateSalary {
	
	
	private String name;
	private String type;
	private int hours;
	
	public FulltimerClass(String name2, String type2, int hours2) {
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
		return hours;
	}
	@Override
	public int SalaryCalc(int hoursWorked) {
		int wagePerHour = 1200;
		return (getHours() * wagePerHour);
		
	}
//	private String name;//privateによって、同じクラス内からのみアクセス可能➡ゲッターとセッターでのみ取得可能。また、field keyがある＝コンストラクタがあること！
//	
//	private int hours;//コンストラクタがある＝field keyの初期値を設定すること！
//
//	
//	public FulltimerClass(String name, int hours) {//Mainクラスから実引数を受け取る。
//		this.name = name;//field keyの初期値を受け取った実引数に設定
//		
//		this.hours = hours;//field keyの初期値を設定
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
//	@Override
//	public int SalaryCalculater() {
//		int wageRate = 1500;
//		int salary = getHours() * wageRate;
//		return salary;
//	}
	//
	//	SubClass_Contract_Employee(String name, String type, int hour) {
	//		super(name, type, hour);
	//	}
	//
	//	@Override
	//	public int SalaryCalculater(int hoursWorked) {
	//		int wagePerHour = 1000;
	//		int wagePerDay = getHours() * wagePerHour;
	//		return wagePerDay;
	//	}
}
