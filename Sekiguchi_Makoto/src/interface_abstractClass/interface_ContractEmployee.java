package interface_abstractClass;

public class interface_ContractEmployee extends interface_AbstractClass_Billable{
public interface_ContractEmployee(String id, String name) {
	super(id, name);
}


@Override
public int costForDay(int hoursWorked) {//抽象メソッドのinterface_ContractEmployee ver.抽象メソッドを引き継いだ抽象クラスを引き継いだ子クラスの契約社員の具体的なメソッドの処理
	int hourlyRate = 1000;
	return (hourlyRate * hoursWorked);
}
}
