package interface_abstractClass;

public interface Billable {//インターフェイスの宣言；これにより{}内の抽象メソッドを必ず実装しなければならなくなる。

	int costForDay(int hoursWorked);//全社員に共通する”労働時間”を定義している。具体的な処理時には必ずreturnする。

}
