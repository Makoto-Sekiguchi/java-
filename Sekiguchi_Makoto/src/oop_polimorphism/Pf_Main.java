package oop_polimorphism;

import java.util.ArrayList;
import java.util.List;

public class Pf_Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
List<Pf_Abstract_Employee> employees = new ArrayList<>();/*リストの性質を持つemployeesオブジェクトを作成。
List<>:import java.util.Listで使用可能になる。ArrayList<>:import java.util.ArrayList;で使用可能になる*/
//以下、リストの性質を持つemployeesオブジェクトに、実引数（詳細な値）持ちのフルタイム社員と契約社員を追加するという旨の内容を記述していく。
//これらの実引数（詳細値）は、サブクラスであるPf_FullTimeEmployeeとPf_ContractEmployee内でそれぞれ処理される。

// Pf_FullTimeEmployeeを2名とそのidを追加
employees.add(new Pf_FullTimeEmployee("F001", "佐藤"));

employees.add(new Pf_FullTimeEmployee("F002", "高橋"));

// Pf_ConstractEmployeeを2名とそのidを追加
employees.add(new Pf_ContractEmployee("C001", "田中"));

employees.add(new Pf_ContractEmployee("C002", "山田"));


//for-eachループで各社員の日給を出力
//List<Pf_Abstract_Employee>をループする。
for (Pf_Abstract_Employee emp : employees) {//employeeの計４名がempに代入されていく。
	int hours = 0;
	if (emp.getName().equals("佐藤")) {
		hours = 7;
	} else if (emp.getName().equals("高橋")) {
		hours = 8;
	} else if (emp.getName().equals("田中")) {
		hours = 9;
	} else if (emp.getName().equals("山田")) {
		hours = 10;
	}
	int wage = emp.intcalculateDailyWage(hours);
	String employeeType = emp.getClass().getSimpleName();
	System.out.printf("社員： %s (%s), 勤務時間： %d時間, 日給： %d\n", emp.getName(), employeeType, hours, wage);
}

	}

}
