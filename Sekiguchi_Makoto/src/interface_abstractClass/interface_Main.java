package interface_abstractClass;

import java.util.ArrayList;
import java.util.List;



public class interface_Main {
public static void main(String[] args) {
	//for文で同じ処理をするための準備：List<> = new ArrayList<>():リスト化。かつpayables:payablesというコンテナで、複数の社員のデータが格納された大きい箱の役割。かつ<Billable>:各データの型をBillableという"型"に統一する。
	List<Billable> payables = new ArrayList<>();//payablesに追加されたもの(12～15行目)をすべてBillable型のリストとして格納することを意味する。
	//List
	payables.add(new interface_ContractEmployee("F001", "契約社員1"));//社員オブジェクト
	payables.add(new interface_ContractEmployee("F001", "契約社員2"));//社員オブジェクト
	payables.add(new Interface_FullTimeEmployee("F001", "正社員1"));//社員オブジェクト
	payables.add(new Interface_FullTimeEmployee("F001", "正社員2"));//社員オブジェクト
	
	int [] hoursList = {10, 7, 8, 9};
	
	
	
	
	//リストに追加されたすべてのデータに対して同じ日給計算処理の仕方を適用する。
	
	for (int i = 0 ; i < payables.size() ; i++) {
		
		int hours = hoursList[i];//勤務時間の取得：配列10,7,8,9をhours変数に代入。
		Billable item = payables.get(i);//各社員オブジェクトの取得し、Billable型の変数itemに代入。
		
		int cost = item.costForDay(hours);//ポリモーフィズムの実行：各社員オブジェクトの種類（フルタイムor契約）を判断してからcostForDayメソッドを実行。その実行結果を変数costに代入。
		
		String name = "";
		String type = item.getClass().getSimpleName();//各社員オブジェクトのフルタイムと契約クラスを取得しそのクラス名を文字列化する。
		if (item instanceof interface_AbstractClass_Billable) {
			name = ((interface_AbstractClass_Billable)item).getName();//現在Billable型で扱われている変数itemを抽象クラスに戻すcastという作業。
		}
		System.out.printf("社員名： %s (%s), 勤務時間： %d時間, 日給： %d円\n", name, type, hours, cost);
	}
	}
}

