package curriculum_B;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      Employee employee = new Employee();//１．オブジェクトの作成完了。ここからフィールドキーとフィールド値を作る段階移行する。

      employee.name = "山田太郎";//２．nameフィールドキーに山田太郎という値を代入しただけ。
      employee.age = 1;//２．ageフィールドキーに1を代入しただけ。

      employee.work();/*３．employeeオブジェクトに対してworkメソッドを適用するボタン。workメソッドに詰め込まれた具体的な機能は
nameフィールドキーを使用した出力表示と、ageフィールドキーを使用した条件分岐と条件に応じた出力表示。*/
	}

}
