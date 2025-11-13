package interface_abstractClass;
/*実装内容：
 * 1.抽象クラスの継承
 * 2.Mainクラスからの実引数の受け取り
 * 3.オーバーライド(抽象メソッドにこのクラス特有の処理を設計して最終値をreturnで返す)
 * */
public class Interface_ContractEmployee extends Interface_AbstractClass_Billable{
public Interface_ContractEmployee(String id, String name) {
	super(id, name);
}


@Override
public int costForDay(int hoursWorked) {//抽象メソッドのinterface_ContractEmployee ver.抽象メソッドを引き継いだ抽象クラスを引き継いだ子クラスの契約社員の具体的なメソッドの処理
	int hourlyRate = 1000;
	return (hourlyRate * hoursWorked);
}
}
