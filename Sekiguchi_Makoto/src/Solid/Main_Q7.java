package Solid;

import java.util.ArrayList;
import java.util.List;

//社員の給与を計算しレポートを出力する
//Main:List.（＝社員名、社員の雇用形態）を勤務時間の配列と双方向対応させるようなforループを作り、勤務時間基準のメソッドを組み込む。後で出力しやすいように最後に分かりやすくフォーマット形式っで出力。
/*抽象クラス:
 * と2つのサブクラス:superとインターフェイスの抽象メソッドの具体的な処理
 * とインターフェイス:勤務時間の実引数を受け取り抽象メソッドを作成する。*/
public class Main_Q7 {

	public static void main(String[] args) {
		
		List<CalculateSalary> allStaff = new ArrayList<>();
		allStaff.add(new FulltimerClass("社員名", "正社員", 2));
		allStaff.add(new ContracterClass("社員名", "契約社員", 1));
		int[] hoursList = { 10, 7, 8, 9 };
		
		
		for (int i = 0 ; i < allStaff.size() ; i++) {
			int hours = hoursList[i];
			CalculateSalary item = allStaff.get(i);
			int cost = item.SalaryCalc(hours);
			String type = allStaff.getClass().getSimpleName();
			String name = item.getName();
			
			System.out.printf("社員名： %s (%s), 勤務時間： %d時間, 日給： %d円\n", name, type, hours, cost);
		}
		
		
		// TODO 自動生成されたメソッド・スタブ
//				List<Employee> report = new ArrayList<>();//左辺の＜＞内はインターフェイスファイル名。ジェネリクスという機能であり、reportリストに格納されるオブジェクトがインターフェイスの型であることを知らせるため。
//				report.add(new SubClass_Contract_Employee("契約社員1", "契約社員", 10));
//				report.add(new SubClass_Contract_Employee("契約社員2", "契約社員", 8));
//				report.add(new SubClass_FullTime_Employee("正社員1", "正社員", 9));
//				report.add(new SubClass_FullTime_Employee("正社員2", "正社員", 6));
//				
//				int [] hoursList = {10, 8, 9, 6};
//				
//				for (int i = 0 ; i < report.size() ; i++) {
//					int hours = hoursList[i];
//					Employee item = report.get(i);//reportリストに格納されている各社員オブジェクトをInterface_Q型のitem変数に格納。
//					
//					int method = item.SalaryCalculater(hours);
//					
//					String name = "";
//					String type = item.getClass().getSimpleName();
//					
//					if (item instanceof AbstractClass) {
//						name = item.getName();//インターフェイスでgetName()メソッドをつけているのでわざわざキャスト型変換を使わなくておkとなる。
//					}
//					System.out.printf("社員名： %s (%s), 勤務時間： %d時間, 日給： %d円\n", name, type, hours, method);
//					
//				}

	}

	
		
	}


