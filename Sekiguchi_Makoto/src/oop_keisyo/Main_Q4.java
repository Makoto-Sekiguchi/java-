package oop_keisyo;

public class Main_Q4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int hoursWorked = 9;//勤務時間。
//		Employee_abstract FullTimeEmployee = new Employee_abstract();
//		Employee_abstract PartTimeEmployee = new Employee_abstract();
		
		Sub_FullTimeEmployee fullTimer = new Sub_FullTimeEmployee("F001", "田中");
		int fullTimeWage = fullTimer.calculateDailyWage(hoursWorked);
		System.out.println(fullTimer.getName());
		System.out.println(fullTimer.getEmployeeld());
		System.out.println(fullTimeWage);
		
		
		Sub_PartTimeEmployee partTimer = new Sub_PartTimeEmployee("P001", "佐藤");
		int partTimeWage = partTimer.calculateDailyWage(hoursWorked);
		System.out.println(partTimer.getName());
		System.out.println(partTimer.getEmployeeld());
		System.out.println(partTimeWage);
		
	}

}
/*継承：抽象クラスとsuperクラスの違い
 * １．抽象クラス：親クラスにはなれるがインスタンス化ができないようなクラスのこと。
 * extendsで子クラスと連動し、抽象メソッドを受け継がせられる。
 * 
 * ２．superクラス：親クラスとインスタンス化の両方で使える。
 * extendsで子クラスと連動し、非抽象メソッドを受け継がせられる。*/

/*Q では、抽象クラスはいつ使えば良いの？superクラスで子クラスと連動させたほうが自由なメソッドを使えるという点で柔軟性がたかくないか？
 *A 抽象クラス・抽象メソッドは、抽象クラスが継承されるすべての子クラスに対して、共通の振る舞いを強制的に実装させたいときに使う!*/

/*Q抽象クラス・抽象メソッドの使用目的は？
 *抽象クラスという箱の中に抽象メソッドという子クラス全体に共通する機能を用意しておくことで、
 子クラス全体に共通する機能を実装し忘れない、かつアプリのアップデート時にコード修正時間を短縮できるようにするため。
 *すべての子クラスに機能を一個一個実装していくと、修正するときに対象の子クラスを特定して一個一個修正する必要が出てくるため、修正に時間がかかってしまう。*/
 