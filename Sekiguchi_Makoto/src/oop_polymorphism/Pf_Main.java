package oop_polymorphism;
import java.util.ArrayList;
import java.util.List;

//リスト化➡データの増減の管理が楽になる。
//継承が含まれるリスト化➡親クラスの継承を受ける実引数の異なるサブクラスを見やすく一括管理できるかつデータの拡張性が向上（将来的にほかのデータを追加するのが楽になる。）する。

//ループ処理➡すべてのデータに対して同じ処理を自動的に実行できるため管理が効率的になる。

public class Pf_Main {

	public static void main(String[] args) {
		//継承が適用されるデータに対するリスト化
List<Pf_Abstract_Employee> employees = new ArrayList<>();

//以下、リストの性質を持つemployeesオブジェクトに、実引数（詳細な値）持ちのフルタイム社員と契約社員を追加するという旨の内容を記述していく。
//これらの実引数（詳細値）は、サブクラスであるPf_FullTimeEmployeeとPf_ContractEmployee内でそれぞれ処理される。
		//実引数持ちのフルタイム社員と契約社員オブジェクトの生成と同時にそれらのデータをemployeesオブジェクトに追加しリスト化させる。
// Pf_FullTimeEmployeeを2名とそのidをemployeesオブジェクトに追加しリスト化
employees.add(new Pf_FullTimeEmployee("F001", "佐藤"));/*new Pf_FullTimeEmployee("F001", "佐藤"):実引数持ちのPf_FullTimeEmployeeオブジェクトの生成。
と同時に、employees.add:employeesオブジェクトに追加する。という意味。*/

employees.add(new Pf_FullTimeEmployee("F002", "高橋"));

// Pf_ConstractEmployeeを2名とそのidをemployeesオブジェクトに追加すると同時にリスト化
employees.add(new Pf_ContractEmployee("C001", "田中"));

employees.add(new Pf_ContractEmployee("C002", "山田"));

				//ループ処理ですべてのデータにintcalculateDailyWageメソッド処理を実行する。
//for-eachループで各社員名とその労働時間の取得と、その労働時間に応じてintcalculateDailyWageメソッドによるの日給の出力
//List<Pf_Abstract_Employee>をループする。
for (Pf_Abstract_Employee emp : employees) {//employeesにリスト化された計４名がempに代入されていく。
	int hours = 0;//
	if (emp.getName().equals("佐藤")) {//emp.getName():empに代入された名前が、.equals("佐藤")佐藤の場合、
		hours = 7;//hours変数に7が代入される。つまり、佐藤を取得したらそいつの時間は７時間にするという意味。.getId()なら、.equalsの()内は"F001"を入れればよい。
	} else if (emp.getName().equals("高橋")) {
		hours = 8;
	} else if (emp.getName().equals("田中")) {
		hours = 9;
	} else if (emp.getName().equals("山田")) {
		hours = 10;
	}
	int wage = emp.intcalculateDailyWage(hours);//これによって、フルタイム社員と契約社員のintcalculateDailyWageメソッドが実行され、その評価基準がhoursとなる。
	String employeeType = emp.getClass().getSimpleName();
	System.out.printf("社員： %s (%s), 勤務時間： %d時間, 日給： %d\n", emp.getName(), employeeType, hours, wage);
}

	}

}
