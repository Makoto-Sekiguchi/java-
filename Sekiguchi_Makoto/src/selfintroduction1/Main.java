package selfintroduction1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person me = new Person("関口誠", 22, 1.72, 60, 20.3);//Person型のme変数に、仮引数持ちのPersonとリンクする実引数持ちのPersonオブジェクトを代入。
		
		
		System.out.println(me.getName());//返される値はすでに実引数が代入されてるため、上記の内容がそのまま出力される。
		System.out.println(me.getAge());//つまり、具体的な処理がPerson.javaで記述されている。
		System.out.println(me.getHeight());
		System.out.println(me.getWeight());
		System.out.println(me.getBmi());
		
		me.print();//void型のprintメソッドを使う方法
		
	}

	

	
}
