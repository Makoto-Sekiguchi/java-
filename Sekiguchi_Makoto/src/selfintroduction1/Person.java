package selfintroduction1;

public class Person {
//Q1field key
	private String name;//０．初期値をセットし、
	private int age;
	private double height;
	private double weight;
	private double bmi;
	
	

//Q2コンストラクタの生成
	public Person(String name2, int age2, double height2, double weight2, double bmi2) {//１．実引数を受け取り、
	
	
//Q3コンストラクタにfield keyと値をを代入		
		this.name/*Personクラスのnameという意味。*/ = name2;//２．受け取った値を代入し、(thisを忘れない！)
		this.age = age2;
		this.height = height2;
		this.weight = weight2;
		this.bmi = bmi2;
	}
	
	public String getName() {//３．その代入された値を手に入れて、
		return this.name;//４．その値を返す。
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getBmi() {
		return this.bmi = weight / (height * height);
	}
	public void print() {
		System.out.println("名前は" + getName()/*getName()が取得する値はthis.nameだから、
		これでも問題ない！*/ + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("BMIは" + (int)this.bmi + "です。");//整数値への型変換はthisの直前に書く！this.～で一つの形！
		System.out.println("人数の合計は1人です。");
	}

	

	
}
