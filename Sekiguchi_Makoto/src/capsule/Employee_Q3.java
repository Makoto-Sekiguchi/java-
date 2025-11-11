package capsule;

public class Employee_Q3 {
	private String employeeld;
	private String name;
	
	public void setEmployeeld(String id) {
		this.employeeld = id;
//フィールドキーに仮引数idを代入。Main_Q3ファイルのEmployee_Q3 capsuleCurriculum = new Employee_Q3();コードによって連動が完了するので仮引数idに実引数田中花子が渡される。
	}
	public String getEmployeeld() {
		return this.employeeld;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
