package capsule;



public class Main_Q3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Employee_Q3 capsuleCurriculum = new Employee_Q3();//ここがカプセル化の原点となるコード！このコードで連動が行わないとカプセル化が出来ないよ！：インスタンス(Employee_Q3のこと)がフィールドやゲッター・セッターを記述しているクラス名(Employee_Q3ファイル)と同名でなければならないことに注意！
		//上記のコードによって、capsuleCurriculumオブジェクトにEmployee_Q3におけるセッター・ゲッターを連動させられるようになったよ！
		capsuleCurriculum.setName("田中花子");//オブジェクト名.セッター名();のカッコ内に実引数を入れた。上記のコードで連動が完了しているので実引数がEmployee_Q3のセッターメソッドの仮引数に渡されると同時にセッターメソッド内の機能も適用される。これによって、Employee_Q3クラスのフィールド値に実引数が代入され、それがreturnで返される。つまり、private修飾子で設定された変数に変更処理をするためにセッター・ゲッターを用いるよ！
		System.out.println(capsuleCurriculum.getName());
		
		capsuleCurriculum.setEmployeeld("E002");
		System.out.println(capsuleCurriculum.getEmployeeld());
		
		
		
		
	}

}
