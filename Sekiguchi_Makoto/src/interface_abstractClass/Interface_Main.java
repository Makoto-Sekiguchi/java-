package interface_abstractClass;

import java.util.ArrayList;
import java.util.List;

/*最終目的：各社員オブジェクトをリスト化するとともに、勤務時間が各オブジェクトに対応する日給計算処理の出力ができるようにしたい。
 * 1.双方向対応させるためのpayablesリストと
 * 2.
 * 3.*/
public class Interface_Main {
	public static void main(String[] args) {
		//for文で同じ処理をするための準備：List<> = new ArrayList<>():リスト化。かつpayables:payablesというコンテナで、複数の社員のデータが格納された大きい箱の役割。かつ<Billable>:各データの型をBillableという"型"に優先して統一する。のちに抽象クラスに型変換してゲッターを利用できるようにすることを忘れない！
		List<Billable> payables = new ArrayList<>();//payablesに追加されたもの(12～15行目)をすべてBillable型のリストとして格納することを意味する。コード記述時の思考：この後にBillable型のpayablesコンテナに様々なオブジェクトを格納するんだなと予想できる！
		//以下、List化するオブジェクト
		payables.add(new Interface_ContractEmployee("F001", "契約社員1"));//社員オブジェクト
		payables.add(new Interface_ContractEmployee("F001", "契約社員2"));//社員オブジェクト
		payables.add(new Interface_FullTimeEmployee("F001", "正社員1"));//社員オブジェクト
		payables.add(new Interface_FullTimeEmployee("F001", "正社員2"));//社員オブジェクト

		int[] hoursList = { 10, 7, 8, 9 };//コード記述時の思考：ここで勤務時間の配列を作っておくことで、この後に書くforループで各社員オブジェクトに対応した勤務時間と各社員の勤務時間に対応した日給計算ができるようになるぞ！

		//リストに追加されたすべてのデータに対して同じ日給計算処理の仕方を適用する。
		
/*コード記述時の思考：勤務時間が各社員オブジェクトと順に対応した(双方向対応した)日給計算には、
forループで変数iがコンテナサイズ未満になるものをpayablesとhourListに適用すれば良いと判断できる。*/
//コード記述時の思考：また、iの適用によって双方向対応したものをそれぞれ何かしらの変数に代入すれば出力時のコード記述が楽になるかもと判断できる！		
		for (int i = 0; i < payables.size(); i++) {
			//26,28,29行目のコードによって勤務時間が各社員オブジェクトと順に対応した。
			int hours = hoursList[i];//変数iを20行目に適用。この配列を変数化すればわざわざcostForDayメソッドにhourList[i]と書かずに済む！
			Billable item = payables.get(i);//変数iを13行目、つまり各社員オブジェクトを格納するpayablesに適用し、それらをBillable型の変数itemに代入。hoursList[i]とpayables.get(i)がそれぞれ対応する。

			int cost = item.costForDay(hours);/*ポリモーフィズムの実行：各社員オブジェクトの勤務時間によってcostForDayメソッドが返す値が異なるようにしたい。
			各社員オブジェクトの種類（フルタイムクラスor契約クラス）を判断してからcostForDayメソッドを実行。その実行結果を変数costに代入。*/

			String name = "";//目的：コンパイルエラーの回避。解説：ここで空文字で初期化することで仮にifブロックに入らなくてもString nameが空文字を持つ有効な文字列と認識され、コンパイルエラーを回避できる。
			
			String type = item.getClass().getSimpleName();//右辺：各社員オブジェクトの２種類のクラスを取得しそのクラス名を文字列化する。左辺：それを文字列型変数typeに代入する。
			if (item instanceof Interface_AbstractClass_Billable) {/*itemが指すオブジェクトは抽象クラスを継承したオブジェクト
			(=interface_ContractEmployeeまたはInterface_FullTimeEmployee)ですか？という意味。*/
				//↓：name = item.getName();//Billableインターフェイス内にゲッターを記述したならこれでおk。
				name = ((Interface_AbstractClass_Billable) item).getName();
				/*現在Billable型での認識が優先で行われている変数item(各社員オブジェクト)を、抽象クラスでの認識を優先にするcastという作業。これによって、抽象クラス内にあるgetName()にアクセス可能となる。
				型変換をしないやり方：Billableインターフェイスにゲッターを付ける。そしてこのMainクラス内ではname = item.getName();と記述するだけでよい。*/
			}
			//System.out.println();
//			for (Billable emp : payables) {
//				int salary = emp.costForDay(9);
//				System.out.println(emp.getName() + "さんの日給は" + salary + "円です");
//			}
			//System.out.println();
			System.out.printf("社員名： %s (%s), 勤務時間： %d時間, 日給： %d円\n", name, type, hours, cost);
		}
	}
}
