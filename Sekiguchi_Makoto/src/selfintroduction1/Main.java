package selfintroduction1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person me = new Person("関口誠", 22, 1.72, 60);//Person型のme変数に、仮引数持ちのPersonとリンクする実引数持ちのPersonオブジェクトを代入。
		
		
		System.out.println(me.getName());//返される値はすでに実引数が代入されてるため、上記の内容がそのまま出力される。
		System.out.println(me.getAge());//つまり、具体的な処理がPerson.javaで記述されている。
		System.out.println(me.getHeight());//me.で由来を特定し、リンクさせる！
		System.out.println(me.getWeight());
		
		
		me.print();/*仮域数・実引数のないメソッドの使用は、ローカル変数の独立性が発動してしまう！
		だから、スコープをまたいで使うときは、仮引数・実引数またはme.等と付けて由来を特定してあげることでリンクさせることが必須！
		*/
		me.BMI();
		
	}

	

	
}
